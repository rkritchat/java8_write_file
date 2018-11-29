import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

import static java.nio.charset.StandardCharsets.UTF_8;

public class WriteFile {

    public static void main(String... args){
        List<TransactionDetail> details = Arrays.asList(
                new TransactionDetail().setId("1").setDescription("test1").setAmount(new BigDecimal("5")).setTime("20:00"),
                new TransactionDetail().setId("2").setDescription("test2").setAmount(new BigDecimal("4")).setTime("21:00"),
                new TransactionDetail().setId("3").setDescription("test3").setAmount(new BigDecimal("3")).setTime("22:00"),
                new TransactionDetail().setId("4").setDescription("test4").setAmount(new BigDecimal("2")).setTime("23:00"),
                new TransactionDetail().setId("5").setDescription("test5").setAmount(new BigDecimal("1")).setTime("24:00"),
                new TransactionDetail().setId("6").setDescription("test6").setAmount(new BigDecimal("0")).setTime("25:00")
        );

        Path path = Paths.get("/Users/laphatrada/desktop/Transaction.txt");
        details.forEach(e -> {
            try{
                if(!Files.exists(path)) Files.createFile(path);
                Files.write(path, e.toString().getBytes(UTF_8), StandardOpenOption.APPEND);
            }catch (IOException exception){
                throw new RuntimeException();
            }
        });

    }
}
