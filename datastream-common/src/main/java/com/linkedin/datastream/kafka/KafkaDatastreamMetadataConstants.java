package com.linkedin.datastream.kafka;

/**
 * Metadata constants that are specific to Kafka (or Kafka MirrorMaker) datastreams.
 */
public class KafkaDatastreamMetadataConstants {

  // Can be used by the transport provider to send to a particular Kafka cluster
  public static final String DESTINATION_KAFKA_BROKERS = "system.destination.KafkaBrokers";

  // The auto.offset.reset Kafka consumer config, used whenever no consumer group offsets are found
  // should be one of: "earliest", "latest", or "none"
  public static final String CONSUMER_OFFSET_RESET_STRATEGY = "system.auto.offset.reset";

  // This is used to identify if this BMM datastream have the passthrough enabled
  public static final String USE_PASSTHROUGH_COMPRESSION = "system.usePassthroughCompression";
}
