package D;

import j.C0766v;
import n2.AbstractC0946A;
import v.C1354h;
import v.InterfaceC1364r;

/* renamed from: D.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0043l implements v.z {

    /* renamed from: a, reason: collision with root package name */
    public int f865a;

    /* renamed from: b, reason: collision with root package name */
    public Object f866b;

    /* renamed from: c, reason: collision with root package name */
    public Object f867c;

    /* JADX WARN: Code restructure failed: missing block: B:16:0x007d, code lost:
    
        if (r9 == null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0043l(E2.d r13, n2.AbstractC0949a r14) {
        /*
            r12 = this;
            r12.<init>()
            D.l r14 = r14.o()
            int r0 = r13.f1076h
            if (r0 < 0) goto Lc4
            int r1 = r14.f865a
            int r1 = r1 + (-1)
            int r13 = r13.f1077i
            int r13 = java.lang.Math.min(r13, r1)
            if (r13 >= r0) goto L29
            j.v r13 = j.AbstractC0737C.f7969a
            java.lang.String r14 = "null cannot be cast to non-null type androidx.collection.ObjectIntMap<K of androidx.collection.ObjectIntMapKt.emptyObjectIntMap>"
            z2.h.d(r13, r14)
            r12.f866b = r13
            r13 = 0
            java.lang.Object[] r14 = new java.lang.Object[r13]
            r12.f867c = r14
            r12.f865a = r13
            goto L9e
        L29:
            int r1 = r13 - r0
            int r1 = r1 + 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r12.f867c = r2
            r12.f865a = r0
            j.v r2 = new j.v
            r2.<init>(r1)
            r14.d(r0)
            r14.d(r13)
            if (r13 < r0) goto L9f
            java.lang.Object r14 = r14.f866b
            L.d r14 = (L.d) r14
            int r1 = n2.AbstractC0946A.c(r0, r14)
            java.lang.Object[] r3 = r14.f4618h
            r3 = r3[r1]
            v.h r3 = (v.C1354h) r3
            int r3 = r3.f11345a
        L50:
            if (r3 > r13) goto L9c
            java.lang.Object[] r4 = r14.f4618h
            r4 = r4[r1]
            v.h r4 = (v.C1354h) r4
            java.lang.Object r5 = r4.f11347c
            v.r r5 = (v.InterfaceC1364r) r5
            y2.c r5 = r5.getKey()
            int r6 = r4.f11345a
            int r7 = java.lang.Math.max(r0, r6)
            int r8 = r4.f11346b
            int r8 = r8 + r6
            int r8 = r8 + (-1)
            int r8 = java.lang.Math.min(r13, r8)
            if (r7 > r8) goto L96
        L71:
            if (r5 == 0) goto L7f
            int r9 = r7 - r6
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.Object r9 = r5.l(r9)
            if (r9 != 0) goto L84
        L7f:
            v.f r9 = new v.f
            r9.<init>(r7)
        L84:
            r2.h(r7, r9)
            java.lang.Object r10 = r12.f867c
            java.lang.Object[] r10 = (java.lang.Object[]) r10
            int r11 = r12.f865a
            int r11 = r7 - r11
            r10[r11] = r9
            if (r7 == r8) goto L96
            int r7 = r7 + 1
            goto L71
        L96:
            int r4 = r4.f11346b
            int r3 = r3 + r4
            int r1 = r1 + 1
            goto L50
        L9c:
            r12.f866b = r2
        L9e:
            return
        L9f:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r1 = "toIndex ("
            r14.<init>(r1)
            r14.append(r13)
            java.lang.String r13 = ") should be not smaller than fromIndex ("
            r14.append(r13)
            r14.append(r0)
            r13 = 41
            r14.append(r13)
            java.lang.String r13 = r14.toString()
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            java.lang.String r13 = r13.toString()
            r14.<init>(r13)
            throw r14
        Lc4:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "negative nearestRange.first"
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: D.C0043l.<init>(E2.d, n2.a):void");
    }

    public void a(int i2, InterfaceC1364r interfaceC1364r) {
        if (i2 < 0) {
            throw new IllegalArgumentException(B1.t.h("size should be >=0, but was ", i2).toString());
        }
        if (i2 == 0) {
            return;
        }
        C1354h c1354h = new C1354h(this.f865a, i2, interfaceC1364r);
        this.f865a += i2;
        ((L.d) this.f866b).b(c1354h);
    }

    @Override // v.z
    public Object b(int i2) {
        int i3 = i2 - this.f865a;
        if (i3 >= 0) {
            Object[] objArr = (Object[]) this.f867c;
            z2.h.f(objArr, "<this>");
            if (i3 <= objArr.length - 1) {
                return objArr[i3];
            }
        }
        return null;
    }

    @Override // v.z
    public int c(Object obj) {
        C0766v c0766v = (C0766v) this.f866b;
        int d3 = c0766v.d(obj);
        if (d3 >= 0) {
            return c0766v.f8053c[d3];
        }
        return -1;
    }

    public void d(int i2) {
        if (i2 < 0 || i2 >= this.f865a) {
            StringBuilder l3 = B1.t.l("Index ", i2, ", size ");
            l3.append(this.f865a);
            throw new IndexOutOfBoundsException(l3.toString());
        }
    }

    public C1354h e(int i2) {
        d(i2);
        C1354h c1354h = (C1354h) this.f867c;
        if (c1354h != null) {
            int i3 = c1354h.f11346b;
            int i4 = c1354h.f11345a;
            if (i2 < i3 + i4 && i4 <= i2) {
                return c1354h;
            }
        }
        L.d dVar = (L.d) this.f866b;
        C1354h c1354h2 = (C1354h) dVar.f4618h[AbstractC0946A.c(i2, dVar)];
        this.f867c = c1354h2;
        return c1354h2;
    }

    public C0043l() {
        this.f866b = new L.d(new C1354h[16]);
    }
}
