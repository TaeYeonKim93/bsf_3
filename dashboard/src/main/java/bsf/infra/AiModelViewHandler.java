package bsf.infra;

import bsf.domain.*;
import bsf.config.kafka.KafkaProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Service
public class AiModelViewHandler {

//<<< DDD / CQRS
    @Autowired
    private AiModelRepository aiModelRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void when_then_CREATE_ (@Payload  ) {
        try {

            if (!.validate()) return;

            // view 객체 생성
            AiModel aiModel = new AiModel();
            // view 객체에 이벤트의 Value 를 set 함
            aiModel.setId(.getModelId());
            aiModel.setModelName(.getModelName());
            aiModel.setIsCreated(true);
            aiModel.setStatus(initialized);
            // view 레파지 토리에 save
            aiModelRepository.save(aiModel);

        }catch (Exception e){
            e.printStackTrace();
        }
    }


    @StreamListener(KafkaProcessor.INPUT)
    public void when_then_UPDATE_(@Payload  ) {
        try {
            if (!.validate()) return;
                // view 객체 조회
            Optional<AiModel> aiModelOptional = aiModelRepository.findById(.getModelId());

            if( aiModelOptional.isPresent()) {
                 AiModel aiModel = aiModelOptional.get();
            // view 객체에 이벤트의 eventDirectValue 를 set 함
                aiModel.setIsAnalyzed(true);    
                aiModel.setPerformance(.getPerformance());    
                aiModel.setStatus(trained);    
                // view 레파지 토리에 save
                 aiModelRepository.save(aiModel);
                }


        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void when_then_UPDATE_(@Payload  ) {
        try {
            if (!.validate()) return;
                // view 객체 조회
            Optional<AiModel> aiModelOptional = aiModelRepository.findById(.getModelId());

            if( aiModelOptional.isPresent()) {
                 AiModel aiModel = aiModelOptional.get();
            // view 객체에 이벤트의 eventDirectValue 를 set 함
                aiModel.setIsDeployed(true);    
                aiModel.setStatus(deployed);    
                // view 레파지 토리에 save
                 aiModelRepository.save(aiModel);
                }


        }catch (Exception e){
            e.printStackTrace();
        }
    }


//>>> DDD / CQRS
}

