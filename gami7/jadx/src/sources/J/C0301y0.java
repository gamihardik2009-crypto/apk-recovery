package J;

import j.C0736B;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import m2.C0880v;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* renamed from: J.y0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0301y0 extends AbstractC1204i implements y2.f {

    /* renamed from: l, reason: collision with root package name */
    public List f4288l;

    /* renamed from: m, reason: collision with root package name */
    public List f4289m;

    /* renamed from: n, reason: collision with root package name */
    public List f4290n;

    /* renamed from: o, reason: collision with root package name */
    public C0736B f4291o;

    /* renamed from: p, reason: collision with root package name */
    public C0736B f4292p;
    public C0736B q;

    /* renamed from: r, reason: collision with root package name */
    public Set f4293r;

    /* renamed from: s, reason: collision with root package name */
    public C0736B f4294s;

    /* renamed from: t, reason: collision with root package name */
    public int f4295t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ X f4296u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C0303z0 f4297v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0301y0(C0303z0 c0303z0, InterfaceC1073d interfaceC1073d) {
        super(3, interfaceC1073d);
        this.f4297v = c0303z0;
    }

    public static final void r(C0303z0 c0303z0, List list, List list2, List list3, C0736B c0736b, C0736B c0736b2, C0736B c0736b3, C0736B c0736b4) {
        synchronized (c0303z0.f4302b) {
            try {
                list.clear();
                list2.clear();
                int size = list3.size();
                for (int i2 = 0; i2 < size; i2++) {
                    C0294v c0294v = (C0294v) list3.get(i2);
                    c0294v.b();
                    c0303z0.D(c0294v);
                }
                list3.clear();
                Object[] objArr = c0736b.f7965b;
                long[] jArr = c0736b.f7964a;
                int length = jArr.length - 2;
                long j3 = -9187201950435737472L;
                if (length >= 0) {
                    int i3 = 0;
                    while (true) {
                        long j4 = jArr[i3];
                        long[] jArr2 = jArr;
                        if ((((~j4) << 7) & j4 & j3) != j3) {
                            int i4 = 8 - ((~(i3 - length)) >>> 31);
                            for (int i5 = 0; i5 < i4; i5++) {
                                if ((j4 & 255) < 128) {
                                    C0294v c0294v2 = (C0294v) objArr[(i3 << 3) + i5];
                                    c0294v2.b();
                                    c0303z0.D(c0294v2);
                                }
                                j4 >>= 8;
                            }
                            if (i4 != 8) {
                                break;
                            }
                        }
                        if (i3 == length) {
                            break;
                        }
                        i3++;
                        jArr = jArr2;
                        j3 = -9187201950435737472L;
                    }
                }
                c0736b.b();
                Object[] objArr2 = c0736b2.f7965b;
                long[] jArr3 = c0736b2.f7964a;
                int length2 = jArr3.length - 2;
                if (length2 >= 0) {
                    int i6 = 0;
                    while (true) {
                        long j5 = jArr3[i6];
                        if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i7 = 8 - ((~(i6 - length2)) >>> 31);
                            for (int i8 = 0; i8 < i7; i8++) {
                                if ((j5 & 255) < 128) {
                                    ((C0294v) objArr2[(i6 << 3) + i8]).i();
                                }
                                j5 >>= 8;
                            }
                            if (i7 != 8) {
                                break;
                            }
                        }
                        if (i6 == length2) {
                            break;
                        } else {
                            i6++;
                        }
                    }
                }
                c0736b2.b();
                c0736b3.b();
                Object[] objArr3 = c0736b4.f7965b;
                long[] jArr4 = c0736b4.f7964a;
                int length3 = jArr4.length - 2;
                if (length3 >= 0) {
                    int i9 = 0;
                    while (true) {
                        long j6 = jArr4[i9];
                        if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i10 = 8 - ((~(i9 - length3)) >>> 31);
                            for (int i11 = 0; i11 < i10; i11++) {
                                if ((j6 & 255) < 128) {
                                    C0294v c0294v3 = (C0294v) objArr3[(i9 << 3) + i11];
                                    c0294v3.b();
                                    c0303z0.D(c0294v3);
                                }
                                j6 >>= 8;
                            }
                            if (i10 != 8) {
                                break;
                            }
                        }
                        if (i9 == length3) {
                            break;
                        } else {
                            i9++;
                        }
                    }
                }
                c0736b4.b();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final void s(List list, C0303z0 c0303z0) {
        list.clear();
        synchronized (c0303z0.f4302b) {
            try {
                ArrayList arrayList = c0303z0.f4310j;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    list.add((AbstractC0254a0) arrayList.get(i2));
                }
                c0303z0.f4310j.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // y2.f
    public final Object i(Object obj, Object obj2, Object obj3) {
        C0301y0 c0301y0 = new C0301y0(this.f4297v, (InterfaceC1073d) obj3);
        c0301y0.f4296u = (X) obj2;
        c0301y0.p(C0880v.f8657a);
        return EnumC1145a.f10026h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a4 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0142 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.util.ArrayList] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x013a -> B:6:0x013d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x01eb -> B:24:0x009f). Please report as a decompilation issue!!! */
    @Override // s2.AbstractC1196a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(java.lang.Object r32) {
        /*
            Method dump skipped, instructions count: 497
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: J.C0301y0.p(java.lang.Object):java.lang.Object");
    }
}
