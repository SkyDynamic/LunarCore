// Code generated by protocol buffer compiler. Do not edit!
package emu.lunarcore.proto;

import java.io.IOException;
import us.hebi.quickbuf.FieldName;
import us.hebi.quickbuf.InvalidProtocolBufferException;
import us.hebi.quickbuf.JsonSink;
import us.hebi.quickbuf.JsonSource;
import us.hebi.quickbuf.MessageFactory;
import us.hebi.quickbuf.ProtoMessage;
import us.hebi.quickbuf.ProtoSink;
import us.hebi.quickbuf.ProtoSource;
import us.hebi.quickbuf.RepeatedMessage;

public final class ChessRogueCellUpdateNotifyOuterClass {
  /**
   * Protobuf type {@code ChessRogueCellUpdateNotify}
   */
  public static final class ChessRogueCellUpdateNotify extends ProtoMessage<ChessRogueCellUpdateNotify> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <pre>
     * EOKIACEIBBD IFMNJMMMJCM = 8;
     * </pre>
     *
     * <code>optional uint32 cell_room_id = 4;</code>
     */
    private int cellRoomId;

    /**
     * <pre>
     * MMKEKJCAHGP reason = 1;
     * </pre>
     *
     * <code>repeated .ChessRogueCell cell_info = 6;</code>
     */
    private final RepeatedMessage<ChessRogueCellOuterClass.ChessRogueCell> cellInfo = RepeatedMessage.newEmptyInstance(ChessRogueCellOuterClass.ChessRogueCell.getFactory());

    private ChessRogueCellUpdateNotify() {
    }

    /**
     * @return a new empty instance of {@code ChessRogueCellUpdateNotify}
     */
    public static ChessRogueCellUpdateNotify newInstance() {
      return new ChessRogueCellUpdateNotify();
    }

    /**
     * <pre>
     * EOKIACEIBBD IFMNJMMMJCM = 8;
     * </pre>
     *
     * <code>optional uint32 cell_room_id = 4;</code>
     * @return whether the cellRoomId field is set
     */
    public boolean hasCellRoomId() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <pre>
     * EOKIACEIBBD IFMNJMMMJCM = 8;
     * </pre>
     *
     * <code>optional uint32 cell_room_id = 4;</code>
     * @return this
     */
    public ChessRogueCellUpdateNotify clearCellRoomId() {
      bitField0_ &= ~0x00000001;
      cellRoomId = 0;
      return this;
    }

    /**
     * <pre>
     * EOKIACEIBBD IFMNJMMMJCM = 8;
     * </pre>
     *
     * <code>optional uint32 cell_room_id = 4;</code>
     * @return the cellRoomId
     */
    public int getCellRoomId() {
      return cellRoomId;
    }

    /**
     * <pre>
     * EOKIACEIBBD IFMNJMMMJCM = 8;
     * </pre>
     *
     * <code>optional uint32 cell_room_id = 4;</code>
     * @param value the cellRoomId to set
     * @return this
     */
    public ChessRogueCellUpdateNotify setCellRoomId(final int value) {
      bitField0_ |= 0x00000001;
      cellRoomId = value;
      return this;
    }

    /**
     * <pre>
     * MMKEKJCAHGP reason = 1;
     * </pre>
     *
     * <code>repeated .ChessRogueCell cell_info = 6;</code>
     * @return whether the cellInfo field is set
     */
    public boolean hasCellInfo() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <pre>
     * MMKEKJCAHGP reason = 1;
     * </pre>
     *
     * <code>repeated .ChessRogueCell cell_info = 6;</code>
     * @return this
     */
    public ChessRogueCellUpdateNotify clearCellInfo() {
      bitField0_ &= ~0x00000002;
      cellInfo.clear();
      return this;
    }

    /**
     * <pre>
     * MMKEKJCAHGP reason = 1;
     * </pre>
     *
     * <code>repeated .ChessRogueCell cell_info = 6;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableCellInfo()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<ChessRogueCellOuterClass.ChessRogueCell> getCellInfo() {
      return cellInfo;
    }

    /**
     * <pre>
     * MMKEKJCAHGP reason = 1;
     * </pre>
     *
     * <code>repeated .ChessRogueCell cell_info = 6;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<ChessRogueCellOuterClass.ChessRogueCell> getMutableCellInfo() {
      bitField0_ |= 0x00000002;
      return cellInfo;
    }

    /**
     * <pre>
     * MMKEKJCAHGP reason = 1;
     * </pre>
     *
     * <code>repeated .ChessRogueCell cell_info = 6;</code>
     * @param value the cellInfo to add
     * @return this
     */
    public ChessRogueCellUpdateNotify addCellInfo(
        final ChessRogueCellOuterClass.ChessRogueCell value) {
      bitField0_ |= 0x00000002;
      cellInfo.add(value);
      return this;
    }

    /**
     * <pre>
     * MMKEKJCAHGP reason = 1;
     * </pre>
     *
     * <code>repeated .ChessRogueCell cell_info = 6;</code>
     * @param values the cellInfo to add
     * @return this
     */
    public ChessRogueCellUpdateNotify addAllCellInfo(
        final ChessRogueCellOuterClass.ChessRogueCell... values) {
      bitField0_ |= 0x00000002;
      cellInfo.addAll(values);
      return this;
    }

    @Override
    public ChessRogueCellUpdateNotify copyFrom(final ChessRogueCellUpdateNotify other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        cellRoomId = other.cellRoomId;
        cellInfo.copyFrom(other.cellInfo);
      }
      return this;
    }

    @Override
    public ChessRogueCellUpdateNotify mergeFrom(final ChessRogueCellUpdateNotify other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasCellRoomId()) {
        setCellRoomId(other.cellRoomId);
      }
      if (other.hasCellInfo()) {
        getMutableCellInfo().addAll(other.cellInfo);
      }
      return this;
    }

    @Override
    public ChessRogueCellUpdateNotify clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      cellRoomId = 0;
      cellInfo.clear();
      return this;
    }

    @Override
    public ChessRogueCellUpdateNotify clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      cellInfo.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof ChessRogueCellUpdateNotify)) {
        return false;
      }
      ChessRogueCellUpdateNotify other = (ChessRogueCellUpdateNotify) o;
      return bitField0_ == other.bitField0_
        && (!hasCellRoomId() || cellRoomId == other.cellRoomId)
        && (!hasCellInfo() || cellInfo.equals(other.cellInfo));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 32);
        output.writeUInt32NoTag(cellRoomId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        for (int i = 0; i < cellInfo.length(); i++) {
          output.writeRawByte((byte) 50);
          output.writeMessageNoTag(cellInfo.get(i));
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(cellRoomId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += (1 * cellInfo.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(cellInfo);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public ChessRogueCellUpdateNotify mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 32: {
            // cellRoomId
            cellRoomId = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 50) {
              break;
            }
          }
          case 50: {
            // cellInfo
            tag = input.readRepeatedMessage(cellInfo, tag);
            bitField0_ |= 0x00000002;
            if (tag != 0) {
              break;
            }
          }
          case 0: {
            return this;
          }
          default: {
            if (!input.skipField(tag)) {
              return this;
            }
            tag = input.readTag();
            break;
          }
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeUInt32(FieldNames.cellRoomId, cellRoomId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRepeatedMessage(FieldNames.cellInfo, cellInfo);
      }
      output.endObject();
    }

    @Override
    public ChessRogueCellUpdateNotify mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -1379654824:
          case 848768290: {
            if (input.isAtField(FieldNames.cellRoomId)) {
              if (!input.trySkipNullValue()) {
                cellRoomId = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -917905104:
          case 1629888875: {
            if (input.isAtField(FieldNames.cellInfo)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(cellInfo);
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          default: {
            input.skipUnknownField();
            break;
          }
        }
      }
      input.endObject();
      return this;
    }

    @Override
    public ChessRogueCellUpdateNotify clone() {
      return new ChessRogueCellUpdateNotify().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static ChessRogueCellUpdateNotify parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new ChessRogueCellUpdateNotify(), data).checkInitialized();
    }

    public static ChessRogueCellUpdateNotify parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ChessRogueCellUpdateNotify(), input).checkInitialized();
    }

    public static ChessRogueCellUpdateNotify parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ChessRogueCellUpdateNotify(), input).checkInitialized();
    }

    /**
     * @return factory for creating ChessRogueCellUpdateNotify messages
     */
    public static MessageFactory<ChessRogueCellUpdateNotify> getFactory() {
      return ChessRogueCellUpdateNotifyFactory.INSTANCE;
    }

    private enum ChessRogueCellUpdateNotifyFactory implements MessageFactory<ChessRogueCellUpdateNotify> {
      INSTANCE;

      @Override
      public ChessRogueCellUpdateNotify create() {
        return ChessRogueCellUpdateNotify.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName cellRoomId = FieldName.forField("cellRoomId", "cell_room_id");

      static final FieldName cellInfo = FieldName.forField("cellInfo", "cell_info");
    }
  }
}