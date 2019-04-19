package one.block.eosiojava.models.rpcProvider;

import one.block.eosiojava.models.rpcProvider.request.GetBlockRequest;
import one.block.eosiojava.models.rpcProvider.response.GetInfoResponse;

/**
 * The type Transaction config.
 */
public class TransactionConfig {

    /**
     * Default blocks behind to use if blocksbehind is not set or instance of this class is not
     * used
     */
    private static final int DEFAULT_BLOCKS_BEHIND = 3;

    /**
     * Default expires seconds to use if expires seconds is not set or instance of this class is not
     * used
     */
    private static final int DEFAULT_EXPIRES_SECONDS = 5 * 60;

    /**
     * The Expires seconds.
     * <br>
     * Append this value to {@link GetInfoResponse#getHeadBlockTime()} in second then assign it to
     * {@link Transaction#setExpiration(String)}
     */
    private int expiresSeconds = DEFAULT_EXPIRES_SECONDS;

    /**
     * The amount blocks behind from head block.
     * <br>
     * It is an argument to calculate head block number to call {@link
     * one.block.eosiojava.interfaces.IRPCProvider#getBlock(GetBlockRequest)}
     */
    private int blocksBehind = DEFAULT_BLOCKS_BEHIND;

    /**
     * Gets config expires seconds to add to expiration time which this formula:
     * <br>
     * Append this value to {@link GetInfoResponse#getHeadBlockTime()} in second then assign it to
     * {@link Transaction#setExpiration(String)}
     *
     * @return the expires seconds
     */
    public int getExpiresSeconds() {
        return expiresSeconds;
    }

    /**
     * Sets expires seconds.
     * <br>
     * Append this value to {@link GetInfoResponse#getHeadBlockTime()} in second then assign it to
     * {@link Transaction#setExpiration(String)}
     *
     * @param expiresSeconds the expires seconds
     */
    public void setExpiresSeconds(int expiresSeconds) {
        this.expiresSeconds = expiresSeconds;
    }

    /**
     * Gets blocks behind.
     * <br>
     * It is an argument to calculate head block number to call {@link
     * one.block.eosiojava.interfaces.IRPCProvider#getBlock(GetBlockRequest)}
     * @return the blocks behind
     */
    public int getBlocksBehind() {
        return blocksBehind;
    }

    /**
     * Sets blocks behind.
     * <br>
     * It is an argument to calculate head block number to call {@link
     * one.block.eosiojava.interfaces.IRPCProvider#getBlock(GetBlockRequest)}
     * @param blocksBehind the blocks behind
     */
    public void setBlocksBehind(int blocksBehind) {
        this.blocksBehind = blocksBehind;
    }
}
