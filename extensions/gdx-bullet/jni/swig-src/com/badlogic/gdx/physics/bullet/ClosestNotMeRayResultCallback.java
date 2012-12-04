/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet;

import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;

public class ClosestNotMeRayResultCallback extends ClosestRayResultCallback {
  private long swigCPtr;

  protected ClosestNotMeRayResultCallback(long cPtr, boolean cMemoryOwn) {
    super(gdxBulletJNI.ClosestNotMeRayResultCallback_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(ClosestNotMeRayResultCallback obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdxBulletJNI.delete_ClosestNotMeRayResultCallback(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public ClosestNotMeRayResultCallback(btCollisionObject me) {
    this(gdxBulletJNI.new_ClosestNotMeRayResultCallback(btCollisionObject.getCPtr(me), me), true);
  }

}
