package net.earthcomputer.multiconnect.protocols.v1_12_2.mixin;

import it.unimi.dsi.fastutil.ints.IntList;
import net.earthcomputer.multiconnect.impl.MixinHelper;
import net.minecraft.tag.TagGroup;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

import java.util.Map;

@Mixin(TagGroup.class_5748.class)
public interface TagGroupNetworkDataAccessor {
    @Invoker("<init>")
    static TagGroup.class_5748 createTagGroupNetworkData(Map<Identifier, IntList> map) {
        return MixinHelper.fakeInstance();
    }
}