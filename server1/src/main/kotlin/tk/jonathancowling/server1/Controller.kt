package tk.jonathancowling.server1

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.client.RestTemplate
import org.springframework.web.client.getForEntity
import java.net.InetAddress

@RestController
class Controller {

    @RequestMapping(path = [ "/" ], method = [ RequestMethod.GET ])
    fun home(): String {
        val res = RestTemplate().getForEntity<String>("http://server2.default.svc.cluster.local:8080/address")
        return "hello from server1 at ${InetAddress.getLocalHost().hostAddress}, spoke to server2 at ${res.body}"
    }

    @RequestMapping(path = [ "/address" ], method = [ RequestMethod.GET ])
    fun address(): String {
        return InetAddress.getLocalHost().hostAddress
    }
}