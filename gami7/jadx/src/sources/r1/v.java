package r1;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class v implements v1.e, v1.d {

    /* renamed from: p, reason: collision with root package name */
    public static final TreeMap f10011p = new TreeMap();

    /* renamed from: h, reason: collision with root package name */
    public final int f10012h;

    /* renamed from: i, reason: collision with root package name */
    public volatile String f10013i;

    /* renamed from: j, reason: collision with root package name */
    public final long[] f10014j;

    /* renamed from: k, reason: collision with root package name */
    public final double[] f10015k;

    /* renamed from: l, reason: collision with root package name */
    public final String[] f10016l;

    /* renamed from: m, reason: collision with root package name */
    public final byte[][] f10017m;

    /* renamed from: n, reason: collision with root package name */
    public final int[] f10018n;

    /* renamed from: o, reason: collision with root package name */
    public int f10019o;

    public v(int i2) {
        this.f10012h = i2;
        int i3 = i2 + 1;
        this.f10018n = new int[i3];
        this.f10014j = new long[i3];
        this.f10015k = new double[i3];
        this.f10016l = new String[i3];
        this.f10017m = new byte[i3][];
    }

    public static final v a(String str, int i2) {
        z2.h.f(str, "query");
        TreeMap treeMap = f10011p;
        synchronized (treeMap) {
            Map.Entry ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i2));
            if (ceilingEntry == null) {
                v vVar = new v(i2);
                vVar.f10013i = str;
                vVar.f10019o = i2;
                return vVar;
            }
            treeMap.remove(ceilingEntry.getKey());
            v vVar2 = (v) ceilingEntry.getValue();
            vVar2.getClass();
            vVar2.f10013i = str;
            vVar2.f10019o = i2;
            return vVar2;
        }
    }

    @Override // v1.e
    public final void b(v1.d dVar) {
        int i2 = this.f10019o;
        if (1 > i2) {
            return;
        }
        int i3 = 1;
        while (true) {
            int i4 = this.f10018n[i3];
            if (i4 == 1) {
                dVar.n(i3);
            } else if (i4 == 2) {
                dVar.t(this.f10014j[i3], i3);
            } else if (i4 == 3) {
                dVar.k(this.f10015k[i3], i3);
            } else if (i4 == 4) {
                String str = this.f10016l[i3];
                if (str == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                dVar.p(str, i3);
            } else if (i4 == 5) {
                byte[] bArr = this.f10017m[i3];
                if (bArr == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                dVar.m(i3, bArr);
            }
            if (i3 == i2) {
                return;
            } else {
                i3++;
            }
        }
    }

    public final void c() {
        TreeMap treeMap = f10011p;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f10012h), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator it = treeMap.descendingKeySet().iterator();
                z2.h.e(it, "queryPool.descendingKeySet().iterator()");
                while (true) {
                    int i2 = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i2;
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // v1.e
    public final String d() {
        String str = this.f10013i;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    @Override // v1.d
    public final void k(double d3, int i2) {
        this.f10018n[i2] = 3;
        this.f10015k[i2] = d3;
    }

    @Override // v1.d
    public final void m(int i2, byte[] bArr) {
        this.f10018n[i2] = 5;
        this.f10017m[i2] = bArr;
    }

    @Override // v1.d
    public final void n(int i2) {
        this.f10018n[i2] = 1;
    }

    @Override // v1.d
    public final void p(String str, int i2) {
        z2.h.f(str, "value");
        this.f10018n[i2] = 4;
        this.f10016l[i2] = str;
    }

    @Override // v1.d
    public final void t(long j3, int i2) {
        this.f10018n[i2] = 2;
        this.f10014j[i2] = j3;
    }
}
