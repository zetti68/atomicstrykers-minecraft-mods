package atomicstryker.updatecheck.client;

import net.minecraft.util.ChatComponentText;
import cpw.mods.fml.client.FMLClientHandler;
import atomicstryker.updatecheck.common.IProxy;

public class UpdateCheckClient implements IProxy
{

    @Override
    public void announce(String announcement)
    {
        /* getChatGUI, printChatMessage */
        FMLClientHandler.instance().getClient().ingameGUI.func_146158_b().func_146227_a(new ChatComponentText(announcement));
    }

}
