/* ###
 * IP: Apache License 2.0 with LLVM Exceptions
 */
/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package SWIG;

public class SBInstructionList {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected SBInstructionList(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SBInstructionList obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        lldbJNI.delete_SBInstructionList(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public SBInstructionList() {
    this(lldbJNI.new_SBInstructionList__SWIG_0(), true);
  }

  public SBInstructionList(SBInstructionList rhs) {
    this(lldbJNI.new_SBInstructionList__SWIG_1(SBInstructionList.getCPtr(rhs), rhs), true);
  }

  public boolean IsValid() {
    return lldbJNI.SBInstructionList_IsValid(swigCPtr, this);
  }

  public long GetSize() {
    return lldbJNI.SBInstructionList_GetSize(swigCPtr, this);
  }

  public SBInstruction GetInstructionAtIndex(long idx) {
    return new SBInstruction(lldbJNI.SBInstructionList_GetInstructionAtIndex(swigCPtr, this, idx), true);
  }

  public long GetInstructionsCount(SBAddress start, SBAddress end, boolean canSetBreakpoint) {
    return lldbJNI.SBInstructionList_GetInstructionsCount(swigCPtr, this, SBAddress.getCPtr(start), start, SBAddress.getCPtr(end), end, canSetBreakpoint);
  }

  public void Clear() {
    lldbJNI.SBInstructionList_Clear(swigCPtr, this);
  }

  public void AppendInstruction(SBInstruction inst) {
    lldbJNI.SBInstructionList_AppendInstruction(swigCPtr, this, SBInstruction.getCPtr(inst), inst);
  }

  public void Print(SBFile out) {
    lldbJNI.SBInstructionList_Print__SWIG_0(swigCPtr, this, SBFile.getCPtr(out), out);
  }

  public void Print(SWIGTYPE_p_std__shared_ptrT_lldb_private__File_t BORROWED) {
    lldbJNI.SBInstructionList_Print__SWIG_1(swigCPtr, this, SWIGTYPE_p_std__shared_ptrT_lldb_private__File_t.getCPtr(BORROWED));
  }

  public boolean GetDescription(SBStream description) {
    return lldbJNI.SBInstructionList_GetDescription(swigCPtr, this, SBStream.getCPtr(description), description);
  }

  public boolean DumpEmulationForAllInstructions(String triple) {
    return lldbJNI.SBInstructionList_DumpEmulationForAllInstructions(swigCPtr, this, triple);
  }

  public String __str__() {
    return lldbJNI.SBInstructionList___str__(swigCPtr, this);
  }

}