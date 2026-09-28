package O2;

import J2.N;
import J2.O;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public class A {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f5159b = AtomicIntegerFieldUpdater.newUpdater(A.class, "_size");
    private volatile int _size;

    /* renamed from: a, reason: collision with root package name */
    public N[] f5160a;

    public final void a(N n3) {
        n3.e((O) this);
        N[] nArr = this.f5160a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f5159b;
        if (nArr == null) {
            nArr = new N[4];
            this.f5160a = nArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= nArr.length) {
            Object[] copyOf = Arrays.copyOf(nArr, atomicIntegerFieldUpdater.get(this) * 2);
            z2.h.e(copyOf, "copyOf(this, newSize)");
            nArr = (N[]) copyOf;
            this.f5160a = nArr;
        }
        int i2 = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i2 + 1);
        nArr[i2] = n3;
        n3.f4364i = i2;
        c(i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0060, code lost:
    
        if (r6.compareTo(r7) < 0) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final J2.N b(int r9) {
        /*
            r8 = this;
            J2.N[] r0 = r8.f5160a
            z2.h.c(r0)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = O2.A.f5159b
            int r2 = r1.get(r8)
            r3 = -1
            int r2 = r2 + r3
            r1.set(r8, r2)
            int r2 = r1.get(r8)
            if (r9 >= r2) goto L7a
            int r2 = r1.get(r8)
            r8.d(r9, r2)
            int r2 = r9 + (-1)
            int r2 = r2 / 2
            if (r9 <= 0) goto L3a
            r4 = r0[r9]
            z2.h.c(r4)
            r5 = r0[r2]
            z2.h.c(r5)
            int r4 = r4.compareTo(r5)
            if (r4 >= 0) goto L3a
            r8.d(r9, r2)
            r8.c(r2)
            goto L7a
        L3a:
            int r2 = r9 * 2
            int r4 = r2 + 1
            int r5 = r1.get(r8)
            if (r4 < r5) goto L45
            goto L7a
        L45:
            J2.N[] r5 = r8.f5160a
            z2.h.c(r5)
            int r2 = r2 + 2
            int r6 = r1.get(r8)
            if (r2 >= r6) goto L63
            r6 = r5[r2]
            z2.h.c(r6)
            r7 = r5[r4]
            z2.h.c(r7)
            int r6 = r6.compareTo(r7)
            if (r6 >= 0) goto L63
            goto L64
        L63:
            r2 = r4
        L64:
            r4 = r5[r9]
            z2.h.c(r4)
            r5 = r5[r2]
            z2.h.c(r5)
            int r4 = r4.compareTo(r5)
            if (r4 > 0) goto L75
            goto L7a
        L75:
            r8.d(r9, r2)
            r9 = r2
            goto L3a
        L7a:
            int r9 = r1.get(r8)
            r9 = r0[r9]
            z2.h.c(r9)
            r2 = 0
            r9.e(r2)
            r9.f4364i = r3
            int r1 = r1.get(r8)
            r0[r1] = r2
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: O2.A.b(int):J2.N");
    }

    public final void c(int i2) {
        while (i2 > 0) {
            N[] nArr = this.f5160a;
            z2.h.c(nArr);
            int i3 = (i2 - 1) / 2;
            N n3 = nArr[i3];
            z2.h.c(n3);
            N n4 = nArr[i2];
            z2.h.c(n4);
            if (n3.compareTo(n4) <= 0) {
                return;
            }
            d(i2, i3);
            i2 = i3;
        }
    }

    public final void d(int i2, int i3) {
        N[] nArr = this.f5160a;
        z2.h.c(nArr);
        N n3 = nArr[i3];
        z2.h.c(n3);
        N n4 = nArr[i2];
        z2.h.c(n4);
        nArr[i2] = n3;
        nArr[i3] = n4;
        n3.f4364i = i2;
        n4.f4364i = i3;
    }
}
