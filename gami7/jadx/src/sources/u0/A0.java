package u0;

import android.graphics.Matrix;
import c0.AbstractC0571K;
import c0.C0565E;

/* loaded from: classes.dex */
public final class A0 {

    /* renamed from: a, reason: collision with root package name */
    public final y2.e f10815a;

    /* renamed from: b, reason: collision with root package name */
    public Matrix f10816b;

    /* renamed from: c, reason: collision with root package name */
    public Matrix f10817c;

    /* renamed from: d, reason: collision with root package name */
    public float[] f10818d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f10819e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f10820f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f10821g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f10822h = true;

    public A0(y2.e eVar) {
        this.f10815a = eVar;
    }

    public final float[] a(Object obj) {
        float[] fArr = this.f10819e;
        if (fArr == null) {
            fArr = C0565E.a();
            this.f10819e = fArr;
        }
        if (this.f10821g) {
            this.f10822h = N.t(b(obj), fArr);
            this.f10821g = false;
        }
        if (this.f10822h) {
            return fArr;
        }
        return null;
    }

    public final float[] b(Object obj) {
        float[] fArr = this.f10818d;
        if (fArr == null) {
            fArr = C0565E.a();
            this.f10818d = fArr;
        }
        if (!this.f10820f) {
            return fArr;
        }
        Matrix matrix = this.f10816b;
        if (matrix == null) {
            matrix = new Matrix();
            this.f10816b = matrix;
        }
        this.f10815a.j(obj, matrix);
        Matrix matrix2 = this.f10817c;
        if (matrix2 == null || !z2.h.a(matrix, matrix2)) {
            AbstractC0571K.v(matrix, fArr);
            this.f10816b = matrix2;
            this.f10817c = matrix;
        }
        this.f10820f = false;
        return fArr;
    }

    public final void c() {
        this.f10820f = true;
        this.f10821g = true;
    }
}
