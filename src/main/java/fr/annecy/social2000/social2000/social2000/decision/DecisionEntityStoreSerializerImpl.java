package fr.annecy.social2000.social2000.social2000.decision;

import fr.annecy.social2000.social2000.social2000.decision.generated.GeneratedDecisionEntityStoreSerializerImpl;

import java.nio.ByteBuffer;
import java.util.function.LongFunction;
import java.util.function.LongToIntFunction;

/**
 * An {@link
 * com.speedment.enterprise.datastore.runtime.entitystore.EntityStoreSerializer}
 * class for table {@link com.speedment.runtime.config.Table} named decision.
 * <p>
 * This file is safe to edit. It will not be overwritten by the code generator.
 * 
 * @author annecy
 */
public final class DecisionEntityStoreSerializerImpl extends GeneratedDecisionEntityStoreSerializerImpl {
    
    public DecisionEntityStoreSerializerImpl(LongFunction<ByteBuffer> bufferFinder, LongToIntFunction offsetFinder) {
        super(bufferFinder, offsetFinder);
    }
}