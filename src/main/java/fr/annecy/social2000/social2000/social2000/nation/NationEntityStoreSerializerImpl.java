package fr.annecy.social2000.social2000.social2000.nation;

import fr.annecy.social2000.social2000.social2000.nation.generated.GeneratedNationEntityStoreSerializerImpl;

import java.nio.ByteBuffer;
import java.util.function.LongFunction;
import java.util.function.LongToIntFunction;

/**
 * An {@link
 * com.speedment.enterprise.datastore.runtime.entitystore.EntityStoreSerializer}
 * class for table {@link com.speedment.runtime.config.Table} named nation.
 * <p>
 * This file is safe to edit. It will not be overwritten by the code generator.
 * 
 * @author annecy
 */
public final class NationEntityStoreSerializerImpl extends GeneratedNationEntityStoreSerializerImpl {
    
    public NationEntityStoreSerializerImpl(LongFunction<ByteBuffer> bufferFinder, LongToIntFunction offsetFinder) {
        super(bufferFinder, offsetFinder);
    }
}