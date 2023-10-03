import kotlinx.serialization.KSerializer;
import org.anime_game_servers.game_data_models.data.quest.SubQuestData;
import org.anime_game_servers.game_data_models.loader.JVMJsonDataLoader;

import java.util.List;

public class JavaTest {

    public void serializerTest() {
        JVMJsonDataLoader loader = new JVMJsonDataLoader();
        KSerializer<SubQuestData> serializer = loader.getSerializer(SubQuestData.class);
        String path = "src/main/resources/emu/grasscutter/data/ability_data.json";
        assert serializer != null;
        List<SubQuestData> subquests = loader.loadFileListJvm(path, serializer);
        assert subquests != null && !subquests.isEmpty();
    }
}
