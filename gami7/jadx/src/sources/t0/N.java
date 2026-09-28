package t0;

import j.C0765u;
import java.util.Map;
import n2.AbstractC0946A;
import r0.AbstractC1103Q;
import r0.C1091E;
import r0.C1115d;
import r0.C1125n;
import r0.InterfaceC1095I;
import r0.InterfaceC1096J;
import r0.InterfaceC1129r;

/* loaded from: classes.dex */
public abstract class N extends AbstractC1103Q implements T, InterfaceC1096J {

    /* renamed from: m, reason: collision with root package name */
    public boolean f10485m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f10486n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f10487o;

    /* renamed from: p, reason: collision with root package name */
    public final C1091E f10488p = new C1091E(0, this);
    public C0765u q;

    /* renamed from: r, reason: collision with root package name */
    public C0765u f10489r;

    public static void F0(Z z3) {
        C1237F c1237f;
        Z z4 = z3.f10548u;
        C1236E c1236e = z4 != null ? z4.f10546s : null;
        C1236E c1236e2 = z3.f10546s;
        if (!z2.h.a(c1236e, c1236e2)) {
            c1236e2.f10379D.f10480r.f10439B.g();
            return;
        }
        InterfaceC1243a f3 = c1236e2.f10379D.f10480r.f();
        if (f3 == null || (c1237f = ((C1242K) f3).f10439B) == null) {
            return;
        }
        c1237f.g();
    }

    public abstract boolean A0();

    public abstract C1236E B0();

    public abstract InterfaceC1095I C0();

    public abstract N D0();

    @Override // t0.T
    public final void E(boolean z3) {
        this.f10485m = z3;
    }

    public abstract long E0();

    @Override // r0.InterfaceC1126o
    public boolean F() {
        return false;
    }

    public abstract void G0();

    @Override // r0.InterfaceC1096J
    public final InterfaceC1095I V(int i2, int i3, Map map, y2.c cVar) {
        if ((i2 & (-16777216)) == 0 && ((-16777216) & i3) == 0) {
            return new C1115d(i2, i3, map, cVar, this, 1);
        }
        AbstractC0946A.r("Size(" + i2 + " x " + i3 + ") is out of range. Each dimension must be between 0 and 16777215.");
        throw null;
    }

    @Override // r0.AbstractC1103Q
    public final int d0(C1125n c1125n) {
        int s02;
        if (A0() && (s02 = s0(c1125n)) != Integer.MIN_VALUE) {
            return s02 + ((int) (this.f9838l & 4294967295L));
        }
        return Integer.MIN_VALUE;
    }

    public abstract int s0(C1125n c1125n);

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f1, code lost:
    
        r35 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ff, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0101, code lost:
    
        r4 = r2.b(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0107, code lost:
    
        if (r2.f8050f != 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x011c, code lost:
    
        if (((r2.f8045a[r4 >> 3] >> ((r4 & 7) << 3)) & 255) != 254) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x012a, code lost:
    
        r4 = r2.f8048d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x012e, code lost:
    
        if (r4 <= 8) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0140, code lost:
    
        if (java.lang.Long.compareUnsigned(r2.f8049e * 32, r4 * 25) > 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0142, code lost:
    
        r4 = r2.f8045a;
        r6 = r2.f8048d;
        r7 = 0;
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0148, code lost:
    
        if (r7 >= r6) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x014a, code lost:
    
        r15 = r7 >> 3;
        r24 = (r7 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x015c, code lost:
    
        if (((r4[r15] >> r24) & 255) != 254) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x015e, code lost:
    
        r5 = r2.f8045a;
        r36 = r3;
        r35 = r4;
        r5[r15] = (r5[r15] & (~(255 << r24))) | (128 << r24);
        r3 = r2.f8048d;
        r4 = ((r7 - 7) & r3) + (r3 & 7);
        r3 = r4 >> 3;
        r4 = (r4 & 7) << 3;
        r38 = r9;
        r39 = r10;
        r5[r3] = (r5[r3] & (~(255 << r4))) | (128 << r4);
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01a0, code lost:
    
        r7 = r7 + 1;
        r4 = r35;
        r3 = r36;
        r9 = r38;
        r10 = r39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0198, code lost:
    
        r36 = r3;
        r35 = r4;
        r38 = r9;
        r39 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01ab, code lost:
    
        r36 = r3;
        r38 = r9;
        r39 = r10;
        r2.f8050f += r14;
        r42 = r0;
        r0 = r8;
        r33 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x026a, code lost:
    
        r4 = r2.b(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x026e, code lost:
    
        r2.f8049e++;
        r0 = r2.f8050f;
        r1 = r2.f8045a;
        r3 = r4 >> 3;
        r5 = r1[r3];
        r7 = (r4 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0289, code lost:
    
        if (((r5 >> r7) & 255) != 128) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x028c, code lost:
    
        r31 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x028e, code lost:
    
        r2.f8050f = r0 - r31;
        r1[r3] = (r5 & (~(255 << r7))) | (r42 << r7);
        r0 = r2.f8048d;
        r3 = ((r4 - 7) & r0) + (r0 & 7);
        r0 = r3 >> 3;
        r3 = (r3 & 7) << 3;
        r1[r0] = (r1[r0] & (~(255 << r3))) | (r42 << r3);
        r0 = ~r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01bd, code lost:
    
        r36 = r3;
        r38 = r9;
        r39 = r10;
        r3 = j.AbstractC0739E.b(r2.f8048d);
        r4 = r2.f8045a;
        r5 = r2.f8046b;
        r6 = r2.f8047c;
        r7 = r2.f8048d;
        r2.d(r3);
        r3 = r2.f8046b;
        r9 = r2.f8047c;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01d9, code lost:
    
        if (r10 >= r7) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01ed, code lost:
    
        if (((r4[r10 >> 3] >> ((r10 & 7) << 3)) & 255) >= 128) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01ef, code lost:
    
        r14 = r5[r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01f1, code lost:
    
        if (r14 == null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01f3, code lost:
    
        r15 = r14.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01f9, code lost:
    
        r15 = r15 * (-862048943);
        r15 = r15 ^ (r15 << 16);
        r22 = r4;
        r4 = r2.b(r15 >>> 7);
        r33 = r12;
        r12 = r15 & 127;
        r15 = r2.f8045a;
        r23 = r4 >> 3;
        r35 = (r4 & 7) << 3;
        r42 = r0;
        r15[r23] = (r15[r23] & (~(255 << r35))) | (r12 << r35);
        r0 = r2.f8048d;
        r1 = ((r4 - 7) & r0) + (r0 & 7);
        r0 = r1 >> 3;
        r1 = (r1 & 7) << 3;
        r23 = r7;
        r44 = r8;
        r15[r0] = (r15[r0] & (~(255 << r1))) | (r12 << r1);
        r3[r4] = r14;
        r9[r4] = r6[r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0257, code lost:
    
        r10 = r10 + 1;
        r4 = r22;
        r7 = r23;
        r12 = r33;
        r0 = r42;
        r8 = r44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01f8, code lost:
    
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x024d, code lost:
    
        r42 = r0;
        r22 = r4;
        r23 = r7;
        r44 = r8;
        r33 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0265, code lost:
    
        r42 = r0;
        r33 = r12;
        r0 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x011e, code lost:
    
        r42 = r0;
        r36 = r3;
        r38 = r9;
        r39 = r10;
        r33 = r12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t0(t0.j0 r46) {
        /*
            Method dump skipped, instructions count: 1006
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.N.t0(t0.j0):void");
    }

    public abstract N y0();

    public abstract InterfaceC1129r z0();
}
