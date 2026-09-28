package c0;

import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;

/* renamed from: c0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0589h {

    /* renamed from: a, reason: collision with root package name */
    public final Paint f7254a;

    /* renamed from: b, reason: collision with root package name */
    public int f7255b = 3;

    /* renamed from: c, reason: collision with root package name */
    public Shader f7256c;

    /* renamed from: d, reason: collision with root package name */
    public C0594m f7257d;

    public C0589h(Paint paint) {
        this.f7254a = paint;
    }

    public final int a() {
        Paint.Cap strokeCap = this.f7254a.getStrokeCap();
        int i2 = strokeCap == null ? -1 : AbstractC0590i.f7258a[strokeCap.ordinal()];
        if (i2 == 1) {
            return 0;
        }
        if (i2 != 2) {
            return i2 != 3 ? 0 : 2;
        }
        return 1;
    }

    public final int b() {
        Paint.Join strokeJoin = this.f7254a.getStrokeJoin();
        int i2 = strokeJoin == null ? -1 : AbstractC0590i.f7259b[strokeJoin.ordinal()];
        if (i2 == 1) {
            return 0;
        }
        if (i2 != 2) {
            return i2 != 3 ? 0 : 1;
        }
        return 2;
    }

    public final void c(float f3) {
        this.f7254a.setAlpha((int) Math.rint(f3 * 255.0f));
    }

    public final void d(int i2) {
        if (AbstractC0571K.m(this.f7255b, i2)) {
            return;
        }
        this.f7255b = i2;
        int i3 = Build.VERSION.SDK_INT;
        Paint paint = this.f7254a;
        if (i3 >= 29) {
            C0581V.f7243a.a(paint, i2);
        } else {
            paint.setXfermode(new PorterDuffXfermode(AbstractC0571K.D(i2)));
        }
    }

    public final void e(long j3) {
        this.f7254a.setColor(AbstractC0571K.A(j3));
    }

    public final void f(C0594m c0594m) {
        this.f7257d = c0594m;
        this.f7254a.setColorFilter(c0594m != null ? c0594m.f7264a : null);
    }

    public final void g(int i2) {
        this.f7254a.setFilterBitmap(!(i2 == 0));
    }

    public final void h(Shader shader) {
        this.f7256c = shader;
        this.f7254a.setShader(shader);
    }

    public final void i(int i2) {
        this.f7254a.setStrokeCap(AbstractC0571K.o(i2, 2) ? Paint.Cap.SQUARE : AbstractC0571K.o(i2, 1) ? Paint.Cap.ROUND : AbstractC0571K.o(i2, 0) ? Paint.Cap.BUTT : Paint.Cap.BUTT);
    }

    public final void j(int i2) {
        this.f7254a.setStrokeJoin(AbstractC0571K.p(i2, 0) ? Paint.Join.MITER : AbstractC0571K.p(i2, 2) ? Paint.Join.BEVEL : AbstractC0571K.p(i2, 1) ? Paint.Join.ROUND : Paint.Join.MITER);
    }

    public final void k(float f3) {
        this.f7254a.setStrokeWidth(f3);
    }

    public final void l(int i2) {
        this.f7254a.setStyle(i2 == 1 ? Paint.Style.STROKE : Paint.Style.FILL);
    }
}
