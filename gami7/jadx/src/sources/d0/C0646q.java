package d0;

import C0.E;
import c0.AbstractC0571K;
import java.util.Arrays;

/* renamed from: d0.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0646q extends AbstractC0632c {

    /* renamed from: r, reason: collision with root package name */
    public static final E f7445r = new E(9);

    /* renamed from: d, reason: collision with root package name */
    public final C0648s f7446d;

    /* renamed from: e, reason: collision with root package name */
    public final float f7447e;

    /* renamed from: f, reason: collision with root package name */
    public final float f7448f;

    /* renamed from: g, reason: collision with root package name */
    public final C0647r f7449g;

    /* renamed from: h, reason: collision with root package name */
    public final float[] f7450h;

    /* renamed from: i, reason: collision with root package name */
    public final float[] f7451i;

    /* renamed from: j, reason: collision with root package name */
    public final float[] f7452j;

    /* renamed from: k, reason: collision with root package name */
    public final InterfaceC0638i f7453k;

    /* renamed from: l, reason: collision with root package name */
    public final C0645p f7454l;

    /* renamed from: m, reason: collision with root package name */
    public final C0642m f7455m;

    /* renamed from: n, reason: collision with root package name */
    public final InterfaceC0638i f7456n;

    /* renamed from: o, reason: collision with root package name */
    public final C0645p f7457o;

    /* renamed from: p, reason: collision with root package name */
    public final C0642m f7458p;
    public final boolean q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0226, code lost:
    
        if (d0.AbstractC0639j.f(r3[4] - r3[0], r3[5] - r3[1], r9[4], r9[5]) >= 0.0f) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0235  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0646q(java.lang.String r33, float[] r34, d0.C0648s r35, float[] r36, d0.InterfaceC0638i r37, d0.InterfaceC0638i r38, float r39, float r40, d0.C0647r r41, int r42) {
        /*
            Method dump skipped, instructions count: 746
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.C0646q.<init>(java.lang.String, float[], d0.s, float[], d0.i, d0.i, float, float, d0.r, int):void");
    }

    @Override // d0.AbstractC0632c
    public final float a(int i2) {
        return this.f7448f;
    }

    @Override // d0.AbstractC0632c
    public final float b(int i2) {
        return this.f7447e;
    }

    @Override // d0.AbstractC0632c
    public final boolean c() {
        return this.q;
    }

    @Override // d0.AbstractC0632c
    public final long d(float f3, float f4, float f5) {
        double d3 = f3;
        C0642m c0642m = this.f7458p;
        float c3 = (float) c0642m.c(d3);
        float c4 = (float) c0642m.c(f4);
        float c5 = (float) c0642m.c(f5);
        float[] fArr = this.f7451i;
        float f6 = (fArr[6] * c5) + (fArr[3] * c4) + (fArr[0] * c3);
        float f7 = (fArr[7] * c5) + (fArr[4] * c4) + (fArr[1] * c3);
        return (Float.floatToRawIntBits(f7) & 4294967295L) | (Float.floatToRawIntBits(f6) << 32);
    }

    @Override // d0.AbstractC0632c
    public final float e(float f3, float f4, float f5) {
        double d3 = f3;
        C0642m c0642m = this.f7458p;
        float c3 = (float) c0642m.c(d3);
        float c4 = (float) c0642m.c(f4);
        float c5 = (float) c0642m.c(f5);
        float[] fArr = this.f7451i;
        return (fArr[8] * c5) + (fArr[5] * c4) + (fArr[2] * c3);
    }

    @Override // d0.AbstractC0632c
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0646q.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        C0646q c0646q = (C0646q) obj;
        if (Float.compare(c0646q.f7447e, this.f7447e) != 0 || Float.compare(c0646q.f7448f, this.f7448f) != 0 || !z2.h.a(this.f7446d, c0646q.f7446d) || !Arrays.equals(this.f7450h, c0646q.f7450h)) {
            return false;
        }
        C0647r c0647r = c0646q.f7449g;
        C0647r c0647r2 = this.f7449g;
        if (c0647r2 != null) {
            return z2.h.a(c0647r2, c0647r);
        }
        if (c0647r == null) {
            return true;
        }
        if (z2.h.a(this.f7453k, c0646q.f7453k)) {
            return z2.h.a(this.f7456n, c0646q.f7456n);
        }
        return false;
    }

    @Override // d0.AbstractC0632c
    public final long f(float f3, float f4, float f5, float f6, AbstractC0632c abstractC0632c) {
        float[] fArr = this.f7452j;
        float f7 = (fArr[6] * f5) + (fArr[3] * f4) + (fArr[0] * f3);
        float f8 = (fArr[7] * f5) + (fArr[4] * f4) + (fArr[1] * f3);
        float f9 = (fArr[8] * f5) + (fArr[5] * f4) + (fArr[2] * f3);
        C0642m c0642m = this.f7455m;
        return AbstractC0571K.b((float) c0642m.c(f7), (float) c0642m.c(f8), (float) c0642m.c(f9), f6, abstractC0632c);
    }

    @Override // d0.AbstractC0632c
    public final int hashCode() {
        int hashCode = (Arrays.hashCode(this.f7450h) + ((this.f7446d.hashCode() + (super.hashCode() * 31)) * 31)) * 31;
        float f3 = this.f7447e;
        int floatToIntBits = (hashCode + (f3 == 0.0f ? 0 : Float.floatToIntBits(f3))) * 31;
        float f4 = this.f7448f;
        int floatToIntBits2 = (floatToIntBits + (f4 == 0.0f ? 0 : Float.floatToIntBits(f4))) * 31;
        C0647r c0647r = this.f7449g;
        int hashCode2 = floatToIntBits2 + (c0647r != null ? c0647r.hashCode() : 0);
        if (c0647r == null) {
            return this.f7456n.hashCode() + ((this.f7453k.hashCode() + (hashCode2 * 31)) * 31);
        }
        return hashCode2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0646q(java.lang.String r12, float[] r13, d0.C0648s r14, final d0.C0647r r15, int r16) {
        /*
            r11 = this;
            r9 = r15
            double r0 = r9.f7464f
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            double r4 = r9.f7465g
            if (r0 != 0) goto L17
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 != 0) goto L17
            d0.o r1 = new d0.o
            r6 = 0
            r1.<init>()
        L15:
            r6 = r1
            goto L1e
        L17:
            d0.o r1 = new d0.o
            r6 = 1
            r1.<init>()
            goto L15
        L1e:
            if (r0 != 0) goto L2c
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 != 0) goto L2c
            d0.o r0 = new d0.o
            r1 = 2
            r0.<init>()
        L2a:
            r7 = r0
            goto L33
        L2c:
            d0.o r0 = new d0.o
            r1 = 3
            r0.<init>()
            goto L2a
        L33:
            r8 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            r10 = 0
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r5 = r6
            r6 = r7
            r7 = r10
            r9 = r15
            r10 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.C0646q.<init>(java.lang.String, float[], d0.s, d0.r, int):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0646q(java.lang.String r18, float[] r19, d0.C0648s r20, final double r21, float r23, float r24, int r25) {
        /*
            r17 = this;
            r1 = r21
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            C0.E r3 = d0.C0646q.f7445r
            if (r0 != 0) goto Lc
            r11 = r3
            goto L13
        Lc:
            d0.n r4 = new d0.n
            r5 = 0
            r4.<init>()
            r11 = r4
        L13:
            if (r0 != 0) goto L17
        L15:
            r12 = r3
            goto L1e
        L17:
            d0.n r3 = new d0.n
            r0 = 1
            r3.<init>()
            goto L15
        L1e:
            d0.r r15 = new d0.r
            r7 = 0
            r9 = 0
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r5 = 0
            r0 = r15
            r1 = r21
            r0.<init>(r1, r3, r5, r7, r9)
            r10 = 0
            r6 = r17
            r7 = r18
            r8 = r19
            r9 = r20
            r13 = r23
            r14 = r24
            r16 = r25
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.C0646q.<init>(java.lang.String, float[], d0.s, double, float, float, int):void");
    }
}
