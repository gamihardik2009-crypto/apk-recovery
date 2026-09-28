package i;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: i.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0705f implements Iterable {

    /* renamed from: h, reason: collision with root package name */
    public C0702c f7799h;

    /* renamed from: i, reason: collision with root package name */
    public C0702c f7800i;

    /* renamed from: j, reason: collision with root package name */
    public final WeakHashMap f7801j = new WeakHashMap();

    /* renamed from: k, reason: collision with root package name */
    public int f7802k = 0;

    public C0702c a(Object obj) {
        C0702c c0702c = this.f7799h;
        while (c0702c != null && !c0702c.f7792h.equals(obj)) {
            c0702c = c0702c.f7794j;
        }
        return c0702c;
    }

    public Object b(Object obj) {
        C0702c a3 = a(obj);
        if (a3 == null) {
            return null;
        }
        this.f7802k--;
        WeakHashMap weakHashMap = this.f7801j;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((AbstractC0704e) it.next()).a(a3);
            }
        }
        C0702c c0702c = a3.f7795k;
        if (c0702c != null) {
            c0702c.f7794j = a3.f7794j;
        } else {
            this.f7799h = a3.f7794j;
        }
        C0702c c0702c2 = a3.f7794j;
        if (c0702c2 != null) {
            c0702c2.f7795k = c0702c;
        } else {
            this.f7800i = c0702c;
        }
        a3.f7794j = null;
        a3.f7795k = null;
        return a3.f7793i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0048, code lost:
    
        if (r3.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        if (((i.C0701b) r7).hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0054, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L4
            return r0
        L4:
            boolean r1 = r7 instanceof i.C0705f
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            i.f r7 = (i.C0705f) r7
            int r1 = r6.f7802k
            int r3 = r7.f7802k
            if (r1 == r3) goto L13
            return r2
        L13:
            java.util.Iterator r1 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L1b:
            r3 = r1
            i.b r3 = (i.C0701b) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L44
            r4 = r7
            i.b r4 = (i.C0701b) r4
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L44
            java.lang.Object r3 = r3.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r4.next()
            if (r3 != 0) goto L3b
            if (r4 != 0) goto L43
        L3b:
            if (r3 == 0) goto L1b
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L1b
        L43:
            return r2
        L44:
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L53
            i.b r7 = (i.C0701b) r7
            boolean r7 = r7.hasNext()
            if (r7 != 0) goto L53
            goto L54
        L53:
            r0 = r2
        L54:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i.C0705f.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i2 = 0;
        while (true) {
            C0701b c0701b = (C0701b) it;
            if (!c0701b.hasNext()) {
                return i2;
            }
            i2 += ((Map.Entry) c0701b.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C0701b c0701b = new C0701b(this.f7799h, this.f7800i, 0);
        this.f7801j.put(c0701b, Boolean.FALSE);
        return c0701b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            C0701b c0701b = (C0701b) it;
            if (!c0701b.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) c0701b.next()).toString());
            if (c0701b.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
