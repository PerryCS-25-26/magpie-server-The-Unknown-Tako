import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.Date;

public class MagpieServer implements HttpHandler
{
    /**
     * Handle an incoming HTTP request
     * @param exchange The HTTP exchange containing the request and response
     */
    @Override
    public void handle(HttpExchange exchange) throws IOException {
        final String requestMethod = exchange.getRequestMethod();
        String requestPath = exchange.getRequestURI().getPath();

        // Log the request
        System.out.println(new Date() + " " + requestMethod + " request for: " + requestPath);

        // Attempt to serve a file from the public folder for any GET request
        if ("GET".equals(requestMethod)) {

            
        else {
            // If the request is not a GET request, return a 405 Method Not Allowed error
            exchange.sendResponseHeaders(HttpURLConnection.HTTP_BAD_METHOD, 0);
            exchange.getResponseBody().close();
        }
    }
}
