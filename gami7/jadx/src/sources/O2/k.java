package O2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public class k {

    /* renamed from: h, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f5190h = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_next");

    /* renamed from: i, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f5191i = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_prev");

    /* renamed from: j, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f5192j = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_removedRef");
    private volatile Object _next = this;
    private volatile Object _prev = this;
    private volatile Object _removedRef;

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003e, code lost:
    
        r6 = ((O2.q) r6).f5203a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0046, code lost:
    
        if (r5.compareAndSet(r4, r3, r6) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
    
        if (r5.get(r4) == r3) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final O2.k k() {
        /*
            r9 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = O2.k.f5191i
            java.lang.Object r1 = r0.get(r9)
            O2.k r1 = (O2.k) r1
            r2 = 0
            r3 = r1
        La:
            r4 = r2
        Lb:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = O2.k.f5190h
            java.lang.Object r6 = r5.get(r3)
            if (r6 != r9) goto L24
            if (r1 != r3) goto L16
            return r3
        L16:
            boolean r2 = r0.compareAndSet(r9, r1, r3)
            if (r2 == 0) goto L1d
            return r3
        L1d:
            java.lang.Object r2 = r0.get(r9)
            if (r2 == r1) goto L16
            goto L0
        L24:
            boolean r7 = r9.p()
            if (r7 == 0) goto L2b
            return r2
        L2b:
            if (r6 != 0) goto L2e
            return r3
        L2e:
            boolean r7 = r6 instanceof O2.p
            if (r7 == 0) goto L38
            O2.p r6 = (O2.p) r6
            r6.a(r3)
            goto L0
        L38:
            boolean r7 = r6 instanceof O2.q
            if (r7 == 0) goto L58
            if (r4 == 0) goto L51
            O2.q r6 = (O2.q) r6
            O2.k r6 = r6.f5203a
        L42:
            boolean r7 = r5.compareAndSet(r4, r3, r6)
            if (r7 == 0) goto L4a
            r3 = r4
            goto La
        L4a:
            java.lang.Object r7 = r5.get(r4)
            if (r7 == r3) goto L42
            goto L0
        L51:
            java.lang.Object r3 = r0.get(r3)
            O2.k r3 = (O2.k) r3
            goto Lb
        L58:
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            z2.h.d(r6, r4)
            r4 = r6
            O2.k r4 = (O2.k) r4
            r8 = r4
            r4 = r3
            r3 = r8
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: O2.k.k():O2.k");
    }

    public final void m(k kVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5191i;
            k kVar2 = (k) atomicReferenceFieldUpdater.get(kVar);
            if (n() != kVar) {
                return;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(kVar, kVar2, this)) {
                if (atomicReferenceFieldUpdater.get(kVar) != kVar2) {
                    break;
                }
            }
            if (p()) {
                kVar.k();
                return;
            }
            return;
        }
    }

    public final Object n() {
        while (true) {
            Object obj = f5190h.get(this);
            if (!(obj instanceof p)) {
                return obj;
            }
            ((p) obj).a(this);
        }
    }

    public final k o() {
        k kVar;
        Object n3 = n();
        q qVar = n3 instanceof q ? (q) n3 : null;
        if (qVar != null && (kVar = qVar.f5203a) != null) {
            return kVar;
        }
        z2.h.d(n3, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        return (k) n3;
    }

    public boolean p() {
        return n() instanceof q;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        sb.append(new j(1, i2, J2.B.class, this, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;"));
        sb.append('@');
        sb.append(J2.B.j(this));
        return sb.toString();
    }
}
