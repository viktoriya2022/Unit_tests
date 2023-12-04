package seminars.fourth.message;


import fourth.message.MessageService;
import fourth.message.NotificationService;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class NotificationServiceTest {
    @Test
    void checkMessage(){
        MessageService messageService = mock(MessageService.class);
        NotificationService notificationService = new NotificationService(messageService);

        notificationService.sendNotification("mes", "My");

        verify(messageService).sendMessage("mes", "My");
    }
}