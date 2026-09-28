package o2;

import O.j;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import n2.AbstractC0962n;

/* renamed from: o2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1000f implements Map, Serializable, A2.e {

    /* renamed from: u, reason: collision with root package name */
    public static final C1000f f9339u;

    /* renamed from: h, reason: collision with root package name */
    public Object[] f9340h;

    /* renamed from: i, reason: collision with root package name */
    public Object[] f9341i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f9342j;

    /* renamed from: k, reason: collision with root package name */
    public int[] f9343k;

    /* renamed from: l, reason: collision with root package name */
    public int f9344l;

    /* renamed from: m, reason: collision with root package name */
    public int f9345m;

    /* renamed from: n, reason: collision with root package name */
    public int f9346n;

    /* renamed from: o, reason: collision with root package name */
    public int f9347o;

    /* renamed from: p, reason: collision with root package name */
    public int f9348p;
    public C1001g q;

    /* renamed from: r, reason: collision with root package name */
    public j f9349r;

    /* renamed from: s, reason: collision with root package name */
    public C1001g f9350s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f9351t;

    static {
        C1000f c1000f = new C1000f(0);
        c1000f.f9351t = true;
        f9339u = c1000f;
    }

    public C1000f() {
        this(8);
    }

    public final int a(Object obj) {
        e();
        while (true) {
            int k3 = k(obj);
            int i2 = this.f9344l * 2;
            int length = this.f9343k.length / 2;
            if (i2 > length) {
                i2 = length;
            }
            int i3 = 0;
            while (true) {
                int[] iArr = this.f9343k;
                int i4 = iArr[k3];
                if (i4 <= 0) {
                    int i5 = this.f9345m;
                    Object[] objArr = this.f9340h;
                    if (i5 < objArr.length) {
                        int i6 = i5 + 1;
                        this.f9345m = i6;
                        objArr[i5] = obj;
                        this.f9342j[i5] = k3;
                        iArr[k3] = i6;
                        this.f9348p++;
                        this.f9347o++;
                        if (i3 > this.f9344l) {
                            this.f9344l = i3;
                        }
                        return i5;
                    }
                    h(1);
                } else {
                    if (z2.h.a(this.f9340h[i4 - 1], obj)) {
                        return -i4;
                    }
                    i3++;
                    if (i3 > i2) {
                        l(this.f9343k.length * 2);
                        break;
                    }
                    k3 = k3 == 0 ? this.f9343k.length - 1 : k3 - 1;
                }
            }
        }
    }

    public final C1000f b() {
        e();
        this.f9351t = true;
        if (this.f9348p > 0) {
            return this;
        }
        C1000f c1000f = f9339u;
        z2.h.d(c1000f, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return c1000f;
    }

    @Override // java.util.Map
    public final void clear() {
        e();
        int i2 = this.f9345m - 1;
        if (i2 >= 0) {
            int i3 = 0;
            while (true) {
                int[] iArr = this.f9342j;
                int i4 = iArr[i3];
                if (i4 >= 0) {
                    this.f9343k[i4] = 0;
                    iArr[i3] = -1;
                }
                if (i3 == i2) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        AbstractC0962n.o(this.f9340h, 0, this.f9345m);
        Object[] objArr = this.f9341i;
        if (objArr != null) {
            AbstractC0962n.o(objArr, 0, this.f9345m);
        }
        this.f9348p = 0;
        this.f9345m = 0;
        this.f9347o++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return i(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return j(obj) >= 0;
    }

    public final void e() {
        if (this.f9351t) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        C1001g c1001g = this.f9350s;
        if (c1001g != null) {
            return c1001g;
        }
        C1001g c1001g2 = new C1001g(this, 0);
        this.f9350s = c1001g2;
        return c1001g2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map) {
                Map map = (Map) obj;
                if (this.f9348p != map.size() || !f(map.entrySet())) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean f(Collection collection) {
        z2.h.f(collection, "m");
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    if (!g((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean g(Map.Entry entry) {
        z2.h.f(entry, "entry");
        int i2 = i(entry.getKey());
        if (i2 < 0) {
            return false;
        }
        Object[] objArr = this.f9341i;
        z2.h.c(objArr);
        return z2.h.a(objArr[i2], entry.getValue());
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int i2 = i(obj);
        if (i2 < 0) {
            return null;
        }
        Object[] objArr = this.f9341i;
        z2.h.c(objArr);
        return objArr[i2];
    }

    public final void h(int i2) {
        Object[] objArr;
        Object[] objArr2 = this.f9340h;
        int length = objArr2.length;
        int i3 = this.f9345m;
        int i4 = length - i3;
        int i5 = i3 - this.f9348p;
        if (i4 < i2 && i4 + i5 >= i2 && i5 >= objArr2.length / 4) {
            l(this.f9343k.length);
            return;
        }
        int i6 = i3 + i2;
        if (i6 < 0) {
            throw new OutOfMemoryError();
        }
        if (i6 > objArr2.length) {
            int length2 = objArr2.length;
            int i7 = length2 + (length2 >> 1);
            if (i7 - i6 < 0) {
                i7 = i6;
            }
            if (i7 - 2147483639 > 0) {
                i7 = i6 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            Object[] copyOf = Arrays.copyOf(objArr2, i7);
            z2.h.e(copyOf, "copyOf(...)");
            this.f9340h = copyOf;
            Object[] objArr3 = this.f9341i;
            if (objArr3 != null) {
                objArr = Arrays.copyOf(objArr3, i7);
                z2.h.e(objArr, "copyOf(...)");
            } else {
                objArr = null;
            }
            this.f9341i = objArr;
            int[] copyOf2 = Arrays.copyOf(this.f9342j, i7);
            z2.h.e(copyOf2, "copyOf(...)");
            this.f9342j = copyOf2;
            if (i7 < 1) {
                i7 = 1;
            }
            int highestOneBit = Integer.highestOneBit(i7 * 3);
            if (highestOneBit > this.f9343k.length) {
                l(highestOneBit);
            }
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        C0998d c0998d = new C0998d(this, 0);
        int i2 = 0;
        while (c0998d.hasNext()) {
            int i3 = c0998d.f7784h;
            C1000f c1000f = (C1000f) c0998d.f7787k;
            if (i3 >= c1000f.f9345m) {
                throw new NoSuchElementException();
            }
            c0998d.f7784h = i3 + 1;
            c0998d.f7785i = i3;
            Object obj = c1000f.f9340h[i3];
            int hashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = c1000f.f9341i;
            z2.h.c(objArr);
            Object obj2 = objArr[c0998d.f7785i];
            int hashCode2 = obj2 != null ? obj2.hashCode() : 0;
            c0998d.e();
            i2 += hashCode ^ hashCode2;
        }
        return i2;
    }

    public final int i(Object obj) {
        int k3 = k(obj);
        int i2 = this.f9344l;
        while (true) {
            int i3 = this.f9343k[k3];
            if (i3 == 0) {
                return -1;
            }
            if (i3 > 0) {
                int i4 = i3 - 1;
                if (z2.h.a(this.f9340h[i4], obj)) {
                    return i4;
                }
            }
            i2--;
            if (i2 < 0) {
                return -1;
            }
            k3 = k3 == 0 ? this.f9343k.length - 1 : k3 - 1;
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f9348p == 0;
    }

    public final int j(Object obj) {
        int i2 = this.f9345m;
        while (true) {
            i2--;
            if (i2 < 0) {
                return -1;
            }
            if (this.f9342j[i2] >= 0) {
                Object[] objArr = this.f9341i;
                z2.h.c(objArr);
                if (z2.h.a(objArr[i2], obj)) {
                    return i2;
                }
            }
        }
    }

    public final int k(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.f9346n;
    }

    @Override // java.util.Map
    public final Set keySet() {
        C1001g c1001g = this.q;
        if (c1001g != null) {
            return c1001g;
        }
        C1001g c1001g2 = new C1001g(this, 1);
        this.q = c1001g2;
        return c1001g2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0066, code lost:
    
        r3[r0] = r7;
        r6.f9342j[r2] = r0;
        r2 = r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(int r7) {
        /*
            r6 = this;
            int r0 = r6.f9347o
            int r0 = r0 + 1
            r6.f9347o = r0
            int r0 = r6.f9345m
            int r1 = r6.f9348p
            r2 = 0
            if (r0 <= r1) goto L3a
            java.lang.Object[] r0 = r6.f9341i
            r1 = r2
            r3 = r1
        L11:
            int r4 = r6.f9345m
            if (r1 >= r4) goto L2c
            int[] r4 = r6.f9342j
            r4 = r4[r1]
            if (r4 < 0) goto L29
            java.lang.Object[] r4 = r6.f9340h
            r5 = r4[r1]
            r4[r3] = r5
            if (r0 == 0) goto L27
            r4 = r0[r1]
            r0[r3] = r4
        L27:
            int r3 = r3 + 1
        L29:
            int r1 = r1 + 1
            goto L11
        L2c:
            java.lang.Object[] r1 = r6.f9340h
            n2.AbstractC0962n.o(r1, r3, r4)
            if (r0 == 0) goto L38
            int r1 = r6.f9345m
            n2.AbstractC0962n.o(r0, r3, r1)
        L38:
            r6.f9345m = r3
        L3a:
            int[] r0 = r6.f9343k
            int r1 = r0.length
            if (r7 == r1) goto L4c
            int[] r0 = new int[r7]
            r6.f9343k = r0
            int r7 = java.lang.Integer.numberOfLeadingZeros(r7)
            int r7 = r7 + 1
            r6.f9346n = r7
            goto L50
        L4c:
            int r7 = r0.length
            java.util.Arrays.fill(r0, r2, r7, r2)
        L50:
            int r7 = r6.f9345m
            if (r2 >= r7) goto L84
            int r7 = r2 + 1
            java.lang.Object[] r0 = r6.f9340h
            r0 = r0[r2]
            int r0 = r6.k(r0)
            int r1 = r6.f9344l
        L60:
            int[] r3 = r6.f9343k
            r4 = r3[r0]
            if (r4 != 0) goto L6e
            r3[r0] = r7
            int[] r1 = r6.f9342j
            r1[r2] = r0
            r2 = r7
            goto L50
        L6e:
            int r1 = r1 + (-1)
            if (r1 < 0) goto L7c
            int r4 = r0 + (-1)
            if (r0 != 0) goto L7a
            int r0 = r3.length
            int r0 = r0 + (-1)
            goto L60
        L7a:
            r0 = r4
            goto L60
        L7c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?"
            r7.<init>(r0)
            throw r7
        L84:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o2.C1000f.l(int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0068 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[LOOP:0: B:8:0x0024->B:25:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(int r12) {
        /*
            r11 = this;
            java.lang.Object[] r0 = r11.f9340h
            java.lang.String r1 = "<this>"
            z2.h.f(r0, r1)
            r1 = 0
            r0[r12] = r1
            java.lang.Object[] r0 = r11.f9341i
            if (r0 == 0) goto L10
            r0[r12] = r1
        L10:
            int[] r0 = r11.f9342j
            r0 = r0[r12]
            int r1 = r11.f9344l
            int r1 = r1 * 2
            int[] r2 = r11.f9343k
            int r2 = r2.length
            int r2 = r2 / 2
            if (r1 <= r2) goto L20
            r1 = r2
        L20:
            r2 = 0
            r3 = r1
            r4 = r2
            r1 = r0
        L24:
            int r5 = r0 + (-1)
            if (r0 != 0) goto L2e
            int[] r0 = r11.f9343k
            int r0 = r0.length
            int r0 = r0 + (-1)
            goto L2f
        L2e:
            r0 = r5
        L2f:
            int r4 = r4 + 1
            int r5 = r11.f9344l
            r6 = -1
            if (r4 <= r5) goto L3b
            int[] r0 = r11.f9343k
            r0[r1] = r2
            goto L6c
        L3b:
            int[] r5 = r11.f9343k
            r7 = r5[r0]
            if (r7 != 0) goto L44
            r5[r1] = r2
            goto L6c
        L44:
            if (r7 >= 0) goto L4b
            r5[r1] = r6
        L48:
            r1 = r0
            r4 = r2
            goto L65
        L4b:
            java.lang.Object[] r5 = r11.f9340h
            int r8 = r7 + (-1)
            r5 = r5[r8]
            int r5 = r11.k(r5)
            int r5 = r5 - r0
            int[] r9 = r11.f9343k
            int r10 = r9.length
            int r10 = r10 + (-1)
            r5 = r5 & r10
            if (r5 < r4) goto L65
            r9[r1] = r7
            int[] r4 = r11.f9342j
            r4[r8] = r1
            goto L48
        L65:
            int r3 = r3 + r6
            if (r3 >= 0) goto L24
            int[] r0 = r11.f9343k
            r0[r1] = r6
        L6c:
            int[] r0 = r11.f9342j
            r0[r12] = r6
            int r12 = r11.f9348p
            int r12 = r12 + r6
            r11.f9348p = r12
            int r12 = r11.f9347o
            int r12 = r12 + 1
            r11.f9347o = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o2.C1000f.m(int):void");
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        e();
        int a3 = a(obj);
        Object[] objArr = this.f9341i;
        if (objArr == null) {
            int length = this.f9340h.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.".toString());
            }
            objArr = new Object[length];
            this.f9341i = objArr;
        }
        if (a3 >= 0) {
            objArr[a3] = obj2;
            return null;
        }
        int i2 = (-a3) - 1;
        Object obj3 = objArr[i2];
        objArr[i2] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        z2.h.f(map, "from");
        e();
        Set<Map.Entry> entrySet = map.entrySet();
        if (entrySet.isEmpty()) {
            return;
        }
        h(entrySet.size());
        for (Map.Entry entry : entrySet) {
            int a3 = a(entry.getKey());
            Object[] objArr = this.f9341i;
            if (objArr == null) {
                int length = this.f9340h.length;
                if (length < 0) {
                    throw new IllegalArgumentException("capacity must be non-negative.".toString());
                }
                objArr = new Object[length];
                this.f9341i = objArr;
            }
            if (a3 >= 0) {
                objArr[a3] = entry.getValue();
            } else {
                int i2 = (-a3) - 1;
                if (!z2.h.a(entry.getValue(), objArr[i2])) {
                    objArr[i2] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        e();
        int i2 = i(obj);
        if (i2 < 0) {
            return null;
        }
        Object[] objArr = this.f9341i;
        z2.h.c(objArr);
        Object obj2 = objArr[i2];
        m(i2);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f9348p;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.f9348p * 3) + 2);
        sb.append("{");
        C0998d c0998d = new C0998d(this, 0);
        int i2 = 0;
        while (c0998d.hasNext()) {
            if (i2 > 0) {
                sb.append(", ");
            }
            int i3 = c0998d.f7784h;
            C1000f c1000f = (C1000f) c0998d.f7787k;
            if (i3 >= c1000f.f9345m) {
                throw new NoSuchElementException();
            }
            c0998d.f7784h = i3 + 1;
            c0998d.f7785i = i3;
            Object obj = c1000f.f9340h[i3];
            if (obj == c1000f) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = c1000f.f9341i;
            z2.h.c(objArr);
            Object obj2 = objArr[c0998d.f7785i];
            if (obj2 == c1000f) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            c0998d.e();
            i2++;
        }
        sb.append("}");
        String sb2 = sb.toString();
        z2.h.e(sb2, "toString(...)");
        return sb2;
    }

    @Override // java.util.Map
    public final Collection values() {
        j jVar = this.f9349r;
        if (jVar != null) {
            return jVar;
        }
        j jVar2 = new j(this);
        this.f9349r = jVar2;
        return jVar2;
    }

    public C1000f(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.".toString());
        }
        Object[] objArr = new Object[i2];
        int[] iArr = new int[i2];
        int highestOneBit = Integer.highestOneBit((i2 < 1 ? 1 : i2) * 3);
        this.f9340h = objArr;
        this.f9341i = null;
        this.f9342j = iArr;
        this.f9343k = new int[highestOneBit];
        this.f9344l = 2;
        this.f9345m = 0;
        this.f9346n = Integer.numberOfLeadingZeros(highestOneBit) + 1;
    }
}
