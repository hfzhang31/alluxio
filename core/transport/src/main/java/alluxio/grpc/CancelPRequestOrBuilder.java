// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/job_master.proto

package alluxio.grpc;

public interface CancelPRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:alluxio.grpc.job.CancelPRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional int64 jobId = 1;</code>
   */
  boolean hasJobId();
  /**
   * <code>optional int64 jobId = 1;</code>
   */
  long getJobId();

  /**
   * <code>optional .alluxio.grpc.job.CancelPOptions options = 2;</code>
   */
  boolean hasOptions();
  /**
   * <code>optional .alluxio.grpc.job.CancelPOptions options = 2;</code>
   */
  alluxio.grpc.CancelPOptions getOptions();
  /**
   * <code>optional .alluxio.grpc.job.CancelPOptions options = 2;</code>
   */
  alluxio.grpc.CancelPOptionsOrBuilder getOptionsOrBuilder();
}