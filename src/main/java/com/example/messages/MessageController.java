package com.example.messages;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MessageController {
    private List<MessageModel> messageList = new ArrayList<>();
    
    @GetMapping("/msg")
    public String showMsg(Model model) {
        model.addAttribute("msgList", messageList);
        model.addAttribute("newMsg", new MessageModel());

        return "messages/messages";
    }

    @PostMapping("/msg")
    public String getMsg(@ModelAttribute MessageModel newMsg) {
        MessageModel msg = new MessageModel(newMsg.getAuthor(), newMsg.getMessage());
        messageList.add(msg);

        return "redirect:msg";
    }
}
