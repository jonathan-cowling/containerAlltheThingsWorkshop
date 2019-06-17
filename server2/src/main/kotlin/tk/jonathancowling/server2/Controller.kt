package tk.jonathancowling.server2

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController
import java.net.InetAddress

@RestController
class Controller {

    @RequestMapping(path = [ "/" ], method = [ RequestMethod.GET ])
    fun home(): String {
        return "hello from server2 at ${InetAddress.getLocalHost().hostAddress}"
    }
}