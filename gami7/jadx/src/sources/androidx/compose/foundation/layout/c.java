package androidx.compose.foundation.layout;

import C0.C0018a;
import H.AbstractC0118h4;
import V.f;
import V.g;
import V.o;
import z2.h;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final FillElement f6639a = new FillElement(1.0f, 2);

    /* renamed from: b, reason: collision with root package name */
    public static final FillElement f6640b = new FillElement(1.0f, 3);

    /* renamed from: c, reason: collision with root package name */
    public static final WrapContentElement f6641c;

    /* renamed from: d, reason: collision with root package name */
    public static final WrapContentElement f6642d;

    /* renamed from: e, reason: collision with root package name */
    public static final WrapContentElement f6643e;

    /* renamed from: f, reason: collision with root package name */
    public static final WrapContentElement f6644f;

    static {
        f fVar = V.b.f5840r;
        f6641c = new WrapContentElement(1, false, new C0018a(15, fVar), fVar);
        f fVar2 = V.b.q;
        f6642d = new WrapContentElement(1, false, new C0018a(15, fVar2), fVar2);
        g gVar = V.b.f5835l;
        f6643e = new WrapContentElement(3, false, new C0018a(16, gVar), gVar);
        g gVar2 = V.b.f5831h;
        f6644f = new WrapContentElement(3, false, new C0018a(16, gVar2), gVar2);
    }

    public static final o a(o oVar, float f3, float f4) {
        return oVar.k(new UnspecifiedConstraintsElement(f3, f4));
    }

    public static final o b(o oVar, float f3) {
        return oVar.k(new SizeElement(0.0f, f3, 0.0f, f3, true, 5));
    }

    public static final o c(o oVar, float f3, float f4) {
        return oVar.k(new SizeElement(0.0f, f3, 0.0f, f4, true, 5));
    }

    public static /* synthetic */ o d(o oVar, float f3, float f4, int i2) {
        if ((i2 & 1) != 0) {
            f3 = Float.NaN;
        }
        if ((i2 & 2) != 0) {
            f4 = Float.NaN;
        }
        return c(oVar, f3, f4);
    }

    public static final o e(o oVar, float f3) {
        return oVar.k(new SizeElement(0.0f, f3, 0.0f, f3, false, 5));
    }

    public static final o f(o oVar, float f3) {
        return oVar.k(new SizeElement(f3, f3, f3, f3, false));
    }

    public static final o g(o oVar, float f3, float f4) {
        return oVar.k(new SizeElement(f3, f4, f3, f4, false));
    }

    public static o h(o oVar, float f3, float f4, float f5, float f6, int i2) {
        return oVar.k(new SizeElement(f3, (i2 & 2) != 0 ? Float.NaN : f4, (i2 & 4) != 0 ? Float.NaN : f5, (i2 & 8) != 0 ? Float.NaN : f6, false));
    }

    public static final o i(float f3) {
        return new SizeElement(f3, 0.0f, f3, 0.0f, false, 10);
    }

    public static final o j(o oVar, float f3) {
        return oVar.k(new SizeElement(f3, f3, f3, f3, true));
    }

    public static final o k(o oVar, float f3, float f4) {
        return oVar.k(new SizeElement(f3, f4, f3, f4, true));
    }

    public static final o l(o oVar, float f3, float f4, float f5, float f6) {
        return oVar.k(new SizeElement(f3, f4, f5, f6, true));
    }

    public static /* synthetic */ o m(o oVar, float f3, float f4, int i2) {
        if ((i2 & 4) != 0) {
            f4 = Float.NaN;
        }
        return l(oVar, f3, Float.NaN, f4, Float.NaN);
    }

    public static final o n(o oVar, float f3) {
        return oVar.k(new SizeElement(f3, 0.0f, f3, 0.0f, true, 10));
    }

    public static o o() {
        return new SizeElement(Float.NaN, 0.0f, AbstractC0118h4.f2682a, 0.0f, true, 10);
    }

    public static o p(o oVar) {
        f fVar = V.b.f5840r;
        return oVar.k(h.a(fVar, fVar) ? f6641c : h.a(fVar, V.b.q) ? f6642d : new WrapContentElement(1, false, new C0018a(15, fVar), fVar));
    }

    public static o q(o oVar, g gVar, int i2) {
        int i3 = i2 & 1;
        g gVar2 = V.b.f5835l;
        if (i3 != 0) {
            gVar = gVar2;
        }
        return oVar.k(h.a(gVar, gVar2) ? f6643e : h.a(gVar, V.b.f5831h) ? f6644f : new WrapContentElement(3, false, new C0018a(16, gVar), gVar));
    }
}
