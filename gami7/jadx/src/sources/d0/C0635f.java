package d0;

import c0.AbstractC0571K;
import c0.C0603v;
import java.util.Arrays;

/* renamed from: d0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0635f extends C0636g {

    /* renamed from: e, reason: collision with root package name */
    public final C0646q f7419e;

    /* renamed from: f, reason: collision with root package name */
    public final C0646q f7420f;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f7421g;

    public C0635f(C0646q c0646q, C0646q c0646q2, int i2) {
        super(c0646q2, c0646q, c0646q2, null);
        float[] h2;
        this.f7419e = c0646q;
        this.f7420f = c0646q2;
        C0648s c0648s = c0646q2.f7446d;
        C0648s c0648s2 = c0646q.f7446d;
        boolean d3 = AbstractC0639j.d(c0648s2, c0648s);
        float[] fArr = c0646q.f7451i;
        float[] fArr2 = c0646q2.f7452j;
        if (d3) {
            h2 = AbstractC0639j.h(fArr2, fArr);
        } else {
            float[] a3 = c0648s2.a();
            C0648s c0648s3 = c0646q2.f7446d;
            float[] a4 = c0648s3.a();
            C0648s c0648s4 = AbstractC0639j.f7428b;
            boolean d4 = AbstractC0639j.d(c0648s2, c0648s4);
            float[] fArr3 = AbstractC0639j.f7431e;
            float[] fArr4 = C0630a.f7389b.f7390a;
            if (!d4) {
                float[] copyOf = Arrays.copyOf(fArr3, 3);
                z2.h.e(copyOf, "copyOf(this, size)");
                fArr = AbstractC0639j.h(AbstractC0639j.c(fArr4, a3, copyOf), fArr);
            }
            if (!AbstractC0639j.d(c0648s3, c0648s4)) {
                float[] copyOf2 = Arrays.copyOf(fArr3, 3);
                z2.h.e(copyOf2, "copyOf(this, size)");
                fArr2 = AbstractC0639j.g(AbstractC0639j.h(AbstractC0639j.c(fArr4, a4, copyOf2), c0646q2.f7451i));
            }
            h2 = AbstractC0639j.h(fArr2, i2 == 3 ? AbstractC0639j.i(new float[]{a3[0] / a4[0], a3[1] / a4[1], a3[2] / a4[2]}, fArr) : fArr);
        }
        this.f7421g = h2;
    }

    @Override // d0.C0636g
    public final long a(long j3) {
        float h2 = C0603v.h(j3);
        float g3 = C0603v.g(j3);
        float e3 = C0603v.e(j3);
        float d3 = C0603v.d(j3);
        C0646q c0646q = this.f7419e;
        float c3 = (float) c0646q.f7458p.c(h2);
        C0642m c0642m = c0646q.f7458p;
        float c4 = (float) c0642m.c(g3);
        float c5 = (float) c0642m.c(e3);
        float[] fArr = this.f7421g;
        float f3 = (fArr[6] * c5) + (fArr[3] * c4) + (fArr[0] * c3);
        float f4 = (fArr[7] * c5) + (fArr[4] * c4) + (fArr[1] * c3);
        float f5 = (fArr[8] * c5) + (fArr[5] * c4) + (fArr[2] * c3);
        C0646q c0646q2 = this.f7420f;
        float c6 = (float) c0646q2.f7455m.c(f3);
        double d4 = f4;
        C0642m c0642m2 = c0646q2.f7455m;
        return AbstractC0571K.b(c6, (float) c0642m2.c(d4), (float) c0642m2.c(f5), d3, c0646q2);
    }
}
