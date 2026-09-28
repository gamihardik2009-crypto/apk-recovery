package Y;

import B.F;
import V.n;
import t0.InterfaceC1255m;
import t0.p0;

/* loaded from: classes.dex */
public final class d extends n implements p0, InterfaceC1255m {

    /* renamed from: u, reason: collision with root package name */
    public d f6235u;

    /* renamed from: v, reason: collision with root package name */
    public d f6236v;

    @Override // V.n
    public final void D0() {
        this.f6236v = null;
        this.f6235u = null;
    }

    public final boolean K0(F f3) {
        d dVar = this.f6235u;
        if (dVar != null) {
            return dVar.K0(f3);
        }
        d dVar2 = this.f6236v;
        if (dVar2 != null) {
            return dVar2.K0(f3);
        }
        return false;
    }

    public final void L0(F f3) {
        d dVar = this.f6236v;
        if (dVar != null) {
            dVar.L0(f3);
            return;
        }
        d dVar2 = this.f6235u;
        if (dVar2 != null) {
            dVar2.L0(f3);
        }
    }

    public final void M0(F f3) {
        d dVar = this.f6236v;
        if (dVar != null) {
            dVar.M0(f3);
        }
        d dVar2 = this.f6235u;
        if (dVar2 != null) {
            dVar2.M0(f3);
        }
        this.f6235u = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void N0(B.F r5) {
        /*
            r4 = this;
            Y.d r0 = r4.f6235u
            if (r0 == 0) goto L1d
            java.lang.Object r1 = r5.f165i
            android.view.DragEvent r1 = (android.view.DragEvent) r1
            float r2 = r1.getX()
            float r1 = r1.getY()
            long r1 = K1.f.e(r2, r1)
            boolean r1 = B1.C.l(r0, r1)
            r2 = 1
            if (r1 != r2) goto L1d
            r1 = r0
            goto L39
        L1d:
            V.n r1 = r4.f5858h
            boolean r1 = r1.f5869t
            if (r1 != 0) goto L25
            r1 = 0
            goto L37
        L25:
            z2.s r1 = new z2.s
            r1.<init>()
            L2.d r2 = new L2.d
            r3 = 3
            r2.<init>(r1, r4, r5, r3)
            t0.AbstractC1248f.z(r4, r2)
            java.lang.Object r1 = r1.f11909h
            t0.p0 r1 = (t0.p0) r1
        L37:
            Y.d r1 = (Y.d) r1
        L39:
            if (r1 == 0) goto L4b
            if (r0 != 0) goto L4b
            r1.L0(r5)
            r1.N0(r5)
            Y.d r0 = r4.f6236v
            if (r0 == 0) goto L7e
            r0.M0(r5)
            goto L7e
        L4b:
            if (r1 != 0) goto L5d
            if (r0 == 0) goto L5d
            Y.d r2 = r4.f6236v
            if (r2 == 0) goto L59
            r2.L0(r5)
            r2.N0(r5)
        L59:
            r0.M0(r5)
            goto L7e
        L5d:
            boolean r2 = z2.h.a(r1, r0)
            if (r2 != 0) goto L71
            if (r1 == 0) goto L6b
            r1.L0(r5)
            r1.N0(r5)
        L6b:
            if (r0 == 0) goto L7e
            r0.M0(r5)
            goto L7e
        L71:
            if (r1 == 0) goto L77
            r1.N0(r5)
            goto L7e
        L77:
            Y.d r0 = r4.f6236v
            if (r0 == 0) goto L7e
            r0.N0(r5)
        L7e:
            r4.f6235u = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.d.N0(B.F):void");
    }

    public final void O0(F f3) {
        d dVar = this.f6236v;
        if (dVar != null) {
            dVar.O0(f3);
            return;
        }
        d dVar2 = this.f6235u;
        if (dVar2 != null) {
            dVar2.O0(f3);
        }
    }

    @Override // t0.p0
    public final Object w() {
        return b.f6232a;
    }
}
