package d0;

import c0.C0603v;

/* renamed from: d0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0636g {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0632c f7422a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0632c f7423b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC0632c f7424c;

    /* renamed from: d, reason: collision with root package name */
    public final float[] f7425d;

    public C0636g(AbstractC0632c abstractC0632c, AbstractC0632c abstractC0632c2, AbstractC0632c abstractC0632c3, float[] fArr) {
        this.f7422a = abstractC0632c;
        this.f7423b = abstractC0632c2;
        this.f7424c = abstractC0632c3;
        this.f7425d = fArr;
    }

    public long a(long j3) {
        float h2 = C0603v.h(j3);
        float g3 = C0603v.g(j3);
        float e3 = C0603v.e(j3);
        float d3 = C0603v.d(j3);
        AbstractC0632c abstractC0632c = this.f7423b;
        long d4 = abstractC0632c.d(h2, g3, e3);
        float intBitsToFloat = Float.intBitsToFloat((int) (d4 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (d4 & 4294967295L));
        float e4 = abstractC0632c.e(h2, g3, e3);
        float[] fArr = this.f7425d;
        if (fArr != null) {
            intBitsToFloat *= fArr[0];
            intBitsToFloat2 *= fArr[1];
            e4 *= fArr[2];
        }
        float f3 = intBitsToFloat;
        float f4 = intBitsToFloat2;
        return this.f7424c.f(f3, f4, e4, d3, this.f7422a);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0636g(d0.AbstractC0632c r12, d0.AbstractC0632c r13, int r14) {
        /*
            r11 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            r3 = 3
            long r4 = r12.f7397b
            long r6 = d0.AbstractC0631b.f7391a
            boolean r4 = d0.AbstractC0631b.a(r4, r6)
            if (r4 == 0) goto L13
            d0.c r4 = d0.AbstractC0639j.a(r12)
            goto L14
        L13:
            r4 = r12
        L14:
            long r8 = r13.f7397b
            boolean r5 = d0.AbstractC0631b.a(r8, r6)
            if (r5 == 0) goto L21
            d0.c r5 = d0.AbstractC0639j.a(r13)
            goto L22
        L21:
            r5 = r13
        L22:
            r8 = 0
            if (r14 != r3) goto L69
            long r9 = r12.f7397b
            boolean r14 = d0.AbstractC0631b.a(r9, r6)
            long r9 = r13.f7397b
            boolean r6 = d0.AbstractC0631b.a(r9, r6)
            if (r14 == 0) goto L36
            if (r6 == 0) goto L36
            goto L69
        L36:
            if (r14 != 0) goto L3a
            if (r6 == 0) goto L69
        L3a:
            if (r14 == 0) goto L3d
            goto L3e
        L3d:
            r12 = r13
        L3e:
            d0.q r12 = (d0.C0646q) r12
            float[] r7 = d0.AbstractC0639j.f7431e
            d0.s r12 = r12.f7446d
            if (r14 == 0) goto L4b
            float[] r14 = r12.a()
            goto L4c
        L4b:
            r14 = r7
        L4c:
            if (r6 == 0) goto L52
            float[] r7 = r12.a()
        L52:
            r12 = r14[r2]
            r6 = r7[r2]
            float r12 = r12 / r6
            r6 = r14[r1]
            r8 = r7[r1]
            float r6 = r6 / r8
            r14 = r14[r0]
            r7 = r7[r0]
            float r14 = r14 / r7
            float[] r8 = new float[r3]
            r8[r2] = r12
            r8[r1] = r6
            r8[r0] = r14
        L69:
            r11.<init>(r13, r4, r5, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.C0636g.<init>(d0.c, d0.c, int):void");
    }
}
