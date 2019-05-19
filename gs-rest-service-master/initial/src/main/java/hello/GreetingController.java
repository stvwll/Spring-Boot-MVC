package hello;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping(value="/greeting")
public class GreetingController {

    static Map<Integer, Greeting> Greetings = Collections.synchronizedMap(new HashMap<Integer, Greeting>());
    
    
    private static final String template = "Restful API homework";
    private static final String time = "2019-05-15T00:00:00Z"; //"2019-05-15T00:00:00Z"
    private final AtomicLong counter = new AtomicLong();
    @RequestMapping("/greeting")
    public Greeting greeting() {
        return new Greeting(counter.incrementAndGet(),
                           String.format(template),
                            String.format(time));
    }
  /*
     @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Greeting> getTaskList(){
        List<Greeting> r = new ArrayList<>(Greetings.values());
        return r;
    }

    @RequestMapping(value="/", method=RequestMethod.POST)
    public String postTaskList(@ModelAttribute Greeting greeting){
    	Greetings.put((int) greeting.getId(),greeting);
        return "success";
    }

   @RequestMapping(value="/{id}", method=RequestMethod.GET)
   public Greeting getTaskList(@PathVariable Integer id) {
        return Greetings.get(id);
    }


    @RequestMapping(value="/{id}", method=RequestMethod.DELETE)
    public String deleteTaskList(@PathVariable Integer id) {
    	Greetings.remove(id);
        return "success";
    }*/
}
