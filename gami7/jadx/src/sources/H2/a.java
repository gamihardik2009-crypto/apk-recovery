package H2;

import B1.C;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class a implements Iterator, A2.a {

    /* renamed from: h, reason: collision with root package name */
    public int f3427h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f3428i;

    /* renamed from: j, reason: collision with root package name */
    public int f3429j;

    /* renamed from: k, reason: collision with root package name */
    public E2.d f3430k;

    /* renamed from: l, reason: collision with root package name */
    public int f3431l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ b f3432m;

    public a(b bVar) {
        this.f3432m = bVar;
        int C3 = C.C(bVar.f3434b, 0, bVar.f3433a.length());
        this.f3428i = C3;
        this.f3429j = C3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0018, code lost:
    
        if (r6 < r3) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r7 = this;
            int r0 = r7.f3429j
            r1 = 0
            if (r0 >= 0) goto Lb
            r7.f3427h = r1
            r0 = 0
            r7.f3430k = r0
            goto L7b
        Lb:
            H2.b r2 = r7.f3432m
            int r3 = r2.f3435c
            r4 = -1
            r5 = 1
            if (r3 <= 0) goto L1a
            int r6 = r7.f3431l
            int r6 = r6 + r5
            r7.f3431l = r6
            if (r6 >= r3) goto L22
        L1a:
            java.lang.CharSequence r3 = r2.f3433a
            int r3 = r3.length()
            if (r0 <= r3) goto L34
        L22:
            E2.d r0 = new E2.d
            int r1 = r7.f3428i
            java.lang.CharSequence r2 = r2.f3433a
            int r2 = H2.l.Q(r2)
            r0.<init>(r1, r2, r5)
            r7.f3430k = r0
            r7.f3429j = r4
            goto L79
        L34:
            y2.e r0 = r2.f3436d
            java.lang.CharSequence r3 = r2.f3433a
            int r6 = r7.f3429j
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object r0 = r0.j(r3, r6)
            m2.g r0 = (m2.C0865g) r0
            if (r0 != 0) goto L58
            E2.d r0 = new E2.d
            int r1 = r7.f3428i
            java.lang.CharSequence r2 = r2.f3433a
            int r2 = H2.l.Q(r2)
            r0.<init>(r1, r2, r5)
            r7.f3430k = r0
            r7.f3429j = r4
            goto L79
        L58:
            java.lang.Object r2 = r0.f8646h
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            java.lang.Object r0 = r0.f8647i
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r3 = r7.f3428i
            E2.d r3 = B1.C.m0(r3, r2)
            r7.f3430k = r3
            int r2 = r2 + r0
            r7.f3428i = r2
            if (r0 != 0) goto L76
            r1 = r5
        L76:
            int r2 = r2 + r1
            r7.f3429j = r2
        L79:
            r7.f3427h = r5
        L7b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: H2.a.a():void");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f3427h == -1) {
            a();
        }
        return this.f3427h == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f3427h == -1) {
            a();
        }
        if (this.f3427h == 0) {
            throw new NoSuchElementException();
        }
        E2.d dVar = this.f3430k;
        z2.h.d(dVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
        this.f3430k = null;
        this.f3427h = -1;
        return dVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
