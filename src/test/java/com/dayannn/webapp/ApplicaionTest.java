package com.dayannn.webapp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class ApplicaionTest {
    @Autowired
    private MockMvc mockMvc;


    @Test
    public void testWelcomePage() throws Exception{
        this.mockMvc.perform(get("/?username=Vupsen")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString(
                        "<html>\n" +
                        "  <head>\n" +
                        "    <title>Welcome page</title>\n" +
                        "  </head>\n" +
                        "  <body>\n" +
                        "  <div>Welcome, Vupsen</div>\n" +
                        "  </body>\n" +
                        "</html>"
                )));

        this.mockMvc.perform(get("/")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString(
                    "<html>\n" +
                            "  <head>\n" +
                            "    <title>Welcome page</title>\n" +
                            "  </head>\n" +
                            "  <body>\n" +
                            "  <div>Welcome, USER</div>\n" +
                            "  </body>\n" +
                            "</html>"
                )));

    }
}
