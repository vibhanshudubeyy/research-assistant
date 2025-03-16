package com.research.assistant;

import org.springframework.stereotype.Service;

@Service
public class ResearchService {

    public String processContent(ResearchRequest request){
        // Build the prompt

        // query the AI model API

        // parse the response

        // return response

        return request.getContent();
    }

    private String buildPrompt(ResearchRequest request){
        StringBuilder prompt = new StringBuilder();
        switch (request.getOperation()){
            case "summarize":
                prompt.append("summarizing the prompt\n\n");
                break;
            case "suggest":
                prompt.append("suggesting the prompt\n\n");
                break;
            default:
                throw new IllegalArgumentException("Invalid operation" + request.getOperation());
        }

        prompt.append(request.getContent());
        return prompt.toString();
    }
}
