package c0;

import android.graphics.Path;
import android.graphics.RectF;

/* renamed from: c0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0591j implements InterfaceC0570J {

    /* renamed from: a, reason: collision with root package name */
    public final Path f7260a;

    /* renamed from: b, reason: collision with root package name */
    public RectF f7261b;

    /* renamed from: c, reason: collision with root package name */
    public float[] f7262c;

    public C0591j(Path path) {
        this.f7260a = path;
    }

    public final b0.d c() {
        if (this.f7261b == null) {
            this.f7261b = new RectF();
        }
        RectF rectF = this.f7261b;
        z2.h.c(rectF);
        this.f7260a.computeBounds(rectF, true);
        return new b0.d(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public final boolean d(InterfaceC0570J interfaceC0570J, InterfaceC0570J interfaceC0570J2, int i2) {
        Path.Op op = i2 == 0 ? Path.Op.DIFFERENCE : i2 == 1 ? Path.Op.INTERSECT : i2 == 4 ? Path.Op.REVERSE_DIFFERENCE : i2 == 2 ? Path.Op.UNION : Path.Op.XOR;
        if (!(interfaceC0570J instanceof C0591j)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        Path path = ((C0591j) interfaceC0570J).f7260a;
        if (interfaceC0570J2 instanceof C0591j) {
            return this.f7260a.op(path, ((C0591j) interfaceC0570J2).f7260a, op);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    public final void e() {
        this.f7260a.reset();
    }

    public final void f(int i2) {
        this.f7260a.setFillType(i2 == 1 ? Path.FillType.EVEN_ODD : Path.FillType.WINDING);
    }
}
