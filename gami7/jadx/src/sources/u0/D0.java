package u0;

import android.graphics.Outline;
import android.os.Build;
import b0.AbstractC0503a;
import c0.AbstractC0569I;
import c0.AbstractC0571K;
import c0.C0566F;
import c0.C0567G;
import c0.C0568H;
import c0.C0591j;
import c0.InterfaceC0570J;

/* loaded from: classes.dex */
public final class D0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f10841a = true;

    /* renamed from: b, reason: collision with root package name */
    public final Outline f10842b;

    /* renamed from: c, reason: collision with root package name */
    public AbstractC0569I f10843c;

    /* renamed from: d, reason: collision with root package name */
    public C0591j f10844d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0570J f10845e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f10846f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f10847g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC0570J f10848h;

    /* renamed from: i, reason: collision with root package name */
    public b0.e f10849i;

    /* renamed from: j, reason: collision with root package name */
    public float f10850j;

    /* renamed from: k, reason: collision with root package name */
    public long f10851k;

    /* renamed from: l, reason: collision with root package name */
    public long f10852l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f10853m;

    public D0() {
        Outline outline = new Outline();
        outline.setAlpha(1.0f);
        this.f10842b = outline;
        this.f10851k = 0L;
        this.f10852l = 0L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0065, code lost:
    
        if (b0.AbstractC0503a.b(r5.f7068e) == r2) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(c0.InterfaceC0600s r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r20.d()
            c0.J r2 = r0.f10845e
            r3 = 1
            if (r2 == 0) goto L11
            r1.d(r2, r3)
            goto Lf2
        L11:
            float r2 = r0.f10850j
            r4 = 0
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 <= 0) goto Lc6
            c0.J r4 = r0.f10848h
            b0.e r5 = r0.f10849i
            if (r4 == 0) goto L68
            long r6 = r0.f10851k
            long r8 = r0.f10852l
            if (r5 == 0) goto L68
            boolean r10 = l0.c.G(r5)
            if (r10 != 0) goto L2b
            goto L68
        L2b:
            float r10 = b0.c.d(r6)
            float r11 = r5.f7064a
            int r10 = (r11 > r10 ? 1 : (r11 == r10 ? 0 : -1))
            if (r10 != 0) goto L68
            float r10 = b0.c.e(r6)
            float r11 = r5.f7065b
            int r10 = (r11 > r10 ? 1 : (r11 == r10 ? 0 : -1))
            if (r10 != 0) goto L68
            float r10 = b0.c.d(r6)
            float r11 = b0.f.d(r8)
            float r11 = r11 + r10
            float r10 = r5.f7066c
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 != 0) goto L68
            float r6 = b0.c.e(r6)
            float r7 = b0.f.b(r8)
            float r7 = r7 + r6
            float r6 = r5.f7067d
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 != 0) goto L68
            long r5 = r5.f7068e
            float r5 = b0.AbstractC0503a.b(r5)
            int r2 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r2 != 0) goto L68
            goto Lc2
        L68:
            long r5 = r0.f10851k
            float r8 = b0.c.d(r5)
            long r5 = r0.f10851k
            float r9 = b0.c.e(r5)
            long r5 = r0.f10851k
            float r2 = b0.c.d(r5)
            long r5 = r0.f10852l
            float r5 = b0.f.d(r5)
            float r10 = r5 + r2
            long r5 = r0.f10851k
            float r2 = b0.c.e(r5)
            long r5 = r0.f10852l
            float r5 = b0.f.b(r5)
            float r11 = r5 + r2
            float r2 = r0.f10850j
            long r5 = B2.a.d(r2, r2)
            float r2 = b0.AbstractC0503a.b(r5)
            float r5 = b0.AbstractC0503a.c(r5)
            long r18 = B2.a.d(r2, r5)
            b0.e r2 = new b0.e
            r7 = r2
            r12 = r18
            r14 = r18
            r16 = r18
            r7.<init>(r8, r9, r10, r11, r12, r14, r16, r18)
            if (r4 != 0) goto Lb5
            c0.j r4 = c0.AbstractC0571K.h()
            goto Lbb
        Lb5:
            r5 = r4
            c0.j r5 = (c0.C0591j) r5
            r5.e()
        Lbb:
            c0.InterfaceC0570J.b(r4, r2)
            r0.f10849i = r2
            r0.f10848h = r4
        Lc2:
            r1.d(r4, r3)
            goto Lf2
        Lc6:
            long r2 = r0.f10851k
            float r2 = b0.c.d(r2)
            long r3 = r0.f10851k
            float r3 = b0.c.e(r3)
            long r4 = r0.f10851k
            float r4 = b0.c.d(r4)
            long r5 = r0.f10852l
            float r5 = b0.f.d(r5)
            float r4 = r4 + r5
            long r5 = r0.f10851k
            float r5 = b0.c.e(r5)
            long r6 = r0.f10852l
            float r6 = b0.f.b(r6)
            float r5 = r5 + r6
            r6 = 1
            r1 = r21
            r1.p(r2, r3, r4, r5, r6)
        Lf2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.D0.a(c0.s):void");
    }

    public final Outline b() {
        d();
        if (this.f10853m && this.f10841a) {
            return this.f10842b;
        }
        return null;
    }

    public final boolean c(AbstractC0569I abstractC0569I, float f3, boolean z3, float f4, long j3) {
        this.f10842b.setAlpha(f3);
        boolean z4 = !z2.h.a(this.f10843c, abstractC0569I);
        if (z4) {
            this.f10843c = abstractC0569I;
            this.f10846f = true;
        }
        this.f10852l = j3;
        boolean z5 = abstractC0569I != null && (z3 || f4 > 0.0f);
        if (this.f10853m != z5) {
            this.f10853m = z5;
            this.f10846f = true;
        }
        return z4;
    }

    public final void d() {
        if (this.f10846f) {
            this.f10851k = 0L;
            this.f10850j = 0.0f;
            this.f10845e = null;
            this.f10846f = false;
            this.f10847g = false;
            AbstractC0569I abstractC0569I = this.f10843c;
            Outline outline = this.f10842b;
            if (abstractC0569I == null || !this.f10853m || b0.f.d(this.f10852l) <= 0.0f || b0.f.b(this.f10852l) <= 0.0f) {
                outline.setEmpty();
                return;
            }
            this.f10841a = true;
            if (abstractC0569I instanceof C0567G) {
                b0.d dVar = ((C0567G) abstractC0569I).f7190a;
                float f3 = dVar.f7060a;
                float f4 = dVar.f7061b;
                this.f10851k = K1.f.e(f3, f4);
                this.f10852l = B1.C.i(dVar.d(), dVar.c());
                outline.setRect(Math.round(dVar.f7060a), Math.round(f4), Math.round(dVar.f7062c), Math.round(dVar.f7063d));
                return;
            }
            if (!(abstractC0569I instanceof C0568H)) {
                if (abstractC0569I instanceof C0566F) {
                    e(((C0566F) abstractC0569I).f7189a);
                    return;
                }
                return;
            }
            b0.e eVar = ((C0568H) abstractC0569I).f7191a;
            float b3 = AbstractC0503a.b(eVar.f7068e);
            float f5 = eVar.f7064a;
            float f6 = eVar.f7065b;
            this.f10851k = K1.f.e(f5, f6);
            this.f10852l = B1.C.i(eVar.b(), eVar.a());
            if (l0.c.G(eVar)) {
                this.f10842b.setRoundRect(Math.round(f5), Math.round(f6), Math.round(eVar.f7066c), Math.round(eVar.f7067d), b3);
                this.f10850j = b3;
                return;
            }
            C0591j c0591j = this.f10844d;
            if (c0591j == null) {
                c0591j = AbstractC0571K.h();
                this.f10844d = c0591j;
            }
            c0591j.e();
            InterfaceC0570J.b(c0591j, eVar);
            e(c0591j);
        }
    }

    public final void e(InterfaceC0570J interfaceC0570J) {
        int i2 = Build.VERSION.SDK_INT;
        Outline outline = this.f10842b;
        if (i2 <= 28 && !((C0591j) interfaceC0570J).f7260a.isConvex()) {
            this.f10841a = false;
            outline.setEmpty();
            this.f10847g = true;
        } else {
            if (!(interfaceC0570J instanceof C0591j)) {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
            outline.setConvexPath(((C0591j) interfaceC0570J).f7260a);
            this.f10847g = !outline.canClip();
        }
        this.f10845e = interfaceC0570J;
    }
}
