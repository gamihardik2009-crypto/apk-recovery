package c0;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Region;

/* renamed from: c0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0584c implements InterfaceC0600s {

    /* renamed from: a, reason: collision with root package name */
    public Canvas f7245a = AbstractC0585d.f7248a;

    /* renamed from: b, reason: collision with root package name */
    public Rect f7246b;

    /* renamed from: c, reason: collision with root package name */
    public Rect f7247c;

    @Override // c0.InterfaceC0600s
    public final void a(C0588g c0588g, long j3, C0589h c0589h) {
        Canvas canvas = this.f7245a;
        if (!(c0588g instanceof C0588g)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
        }
        canvas.drawBitmap(c0588g.f7253a, b0.c.d(j3), b0.c.e(j3), c0589h.f7254a);
    }

    @Override // c0.InterfaceC0600s
    public final void b() {
        this.f7245a.restore();
    }

    @Override // c0.InterfaceC0600s
    public final void d(InterfaceC0570J interfaceC0570J, int i2) {
        Canvas canvas = this.f7245a;
        if (!(interfaceC0570J instanceof C0591j)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.clipPath(((C0591j) interfaceC0570J).f7260a, i2 == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    @Override // c0.InterfaceC0600s
    public final void e(float f3, float f4) {
        this.f7245a.scale(f3, f4);
    }

    @Override // c0.InterfaceC0600s
    public final void f() {
        this.f7245a.save();
    }

    @Override // c0.InterfaceC0600s
    public final void g(InterfaceC0570J interfaceC0570J, C0589h c0589h) {
        Canvas canvas = this.f7245a;
        if (!(interfaceC0570J instanceof C0591j)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.drawPath(((C0591j) interfaceC0570J).f7260a, c0589h.f7254a);
    }

    @Override // c0.InterfaceC0600s
    public final void h() {
        AbstractC0571K.l(this.f7245a, false);
    }

    @Override // c0.InterfaceC0600s
    public final void i(float f3, float f4, float f5, float f6, C0589h c0589h) {
        this.f7245a.drawRect(f3, f4, f5, f6, c0589h.f7254a);
    }

    @Override // c0.InterfaceC0600s
    public final void j(long j3, long j4, C0589h c0589h) {
        this.f7245a.drawLine(b0.c.d(j3), b0.c.e(j3), b0.c.d(j4), b0.c.e(j4), c0589h.f7254a);
    }

    @Override // c0.InterfaceC0600s
    public final void k(float f3, long j3, C0589h c0589h) {
        this.f7245a.drawCircle(b0.c.d(j3), b0.c.e(j3), f3, c0589h.f7254a);
    }

    @Override // c0.InterfaceC0600s
    public final void l(C0588g c0588g, long j3, long j4, long j5, long j6, C0589h c0589h) {
        if (this.f7246b == null) {
            this.f7246b = new Rect();
            this.f7247c = new Rect();
        }
        Canvas canvas = this.f7245a;
        if (!(c0588g instanceof C0588g)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
        }
        Bitmap bitmap = c0588g.f7253a;
        Rect rect = this.f7246b;
        z2.h.c(rect);
        int i2 = (int) (j3 >> 32);
        rect.left = i2;
        int i3 = (int) (j3 & 4294967295L);
        rect.top = i3;
        rect.right = i2 + ((int) (j4 >> 32));
        rect.bottom = i3 + ((int) (j4 & 4294967295L));
        Rect rect2 = this.f7247c;
        z2.h.c(rect2);
        int i4 = (int) (j5 >> 32);
        rect2.left = i4;
        int i5 = (int) (j5 & 4294967295L);
        rect2.top = i5;
        rect2.right = i4 + ((int) (j6 >> 32));
        rect2.bottom = i5 + ((int) (j6 & 4294967295L));
        canvas.drawBitmap(bitmap, rect, rect2, c0589h.f7254a);
    }

    @Override // c0.InterfaceC0600s
    public final void n(float[] fArr) {
        int i2 = 0;
        while (i2 < 4) {
            int i3 = 0;
            while (i3 < 4) {
                if (fArr[(i2 * 4) + i3] != (i2 == i3 ? 1.0f : 0.0f)) {
                    Matrix matrix = new Matrix();
                    AbstractC0571K.u(matrix, fArr);
                    this.f7245a.concat(matrix);
                    return;
                }
                i3++;
            }
            i2++;
        }
    }

    @Override // c0.InterfaceC0600s
    public final void o() {
        AbstractC0571K.l(this.f7245a, true);
    }

    @Override // c0.InterfaceC0600s
    public final void p(float f3, float f4, float f5, float f6, int i2) {
        this.f7245a.clipRect(f3, f4, f5, f6, i2 == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    @Override // c0.InterfaceC0600s
    public final void q(float f3, float f4) {
        this.f7245a.translate(f3, f4);
    }

    @Override // c0.InterfaceC0600s
    public final void r() {
        this.f7245a.rotate(45.0f);
    }

    @Override // c0.InterfaceC0600s
    public final void s(float f3, float f4, float f5, float f6, float f7, float f8, C0589h c0589h) {
        this.f7245a.drawRoundRect(f3, f4, f5, f6, f7, f8, c0589h.f7254a);
    }

    public final Canvas t() {
        return this.f7245a;
    }

    public final void u(Canvas canvas) {
        this.f7245a = canvas;
    }
}
