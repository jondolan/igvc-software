/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.24
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.sourceforge.playerstage.Jplayercore;

public class player_graphics3d_cmd_draw_t {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected player_graphics3d_cmd_draw_t(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(player_graphics3d_cmd_draw_t obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      playercore_javaJNI.delete_player_graphics3d_cmd_draw_t(swigCPtr);
    }
    swigCPtr = 0;
  }

  protected static long[] cArrayUnwrap(player_graphics3d_cmd_draw_t[] arrayWrapper) {
      long[] cArray = new long[arrayWrapper.length];
      for (int i=0; i<arrayWrapper.length; i++)
        cArray[i] = player_graphics3d_cmd_draw_t.getCPtr(arrayWrapper[i]);
      return cArray;
  }

  protected static player_graphics3d_cmd_draw_t[] cArrayWrap(long[] cArray, boolean cMemoryOwn) {
    player_graphics3d_cmd_draw_t[] arrayWrapper = new player_graphics3d_cmd_draw_t[cArray.length];
    for (int i=0; i<cArray.length; i++)
      arrayWrapper[i] = new player_graphics3d_cmd_draw_t(cArray[i], cMemoryOwn);
    return arrayWrapper;
  }

  public void setDraw_mode(long draw_mode) {
    playercore_javaJNI.set_player_graphics3d_cmd_draw_t_draw_mode(swigCPtr, draw_mode);
  }

  public long getDraw_mode() {
    return playercore_javaJNI.get_player_graphics3d_cmd_draw_t_draw_mode(swigCPtr);
  }

  public void setPoints_count(long points_count) {
    playercore_javaJNI.set_player_graphics3d_cmd_draw_t_points_count(swigCPtr, points_count);
  }

  public long getPoints_count() {
    return playercore_javaJNI.get_player_graphics3d_cmd_draw_t_points_count(swigCPtr);
  }

  public void setPoints(player_point_3d_t[] points) {
    playercore_javaJNI.set_player_graphics3d_cmd_draw_t_points(swigCPtr, player_point_3d_t.cArrayUnwrap(points));
  }

  public player_point_3d_t[] getPoints() {
    return player_point_3d_t.cArrayWrap(playercore_javaJNI.get_player_graphics3d_cmd_draw_t_points(swigCPtr), false);
  }

  public void setColor(player_color_t color) {
    playercore_javaJNI.set_player_graphics3d_cmd_draw_t_color(swigCPtr, player_color_t.getCPtr(color));
  }

  public player_color_t getColor() {
    long cPtr = playercore_javaJNI.get_player_graphics3d_cmd_draw_t_color(swigCPtr);
    return (cPtr == 0) ? null : new player_color_t(cPtr, false);
  }

  public player_graphics3d_cmd_draw_t() {
    this(playercore_javaJNI.new_player_graphics3d_cmd_draw_t(), true);
  }

}