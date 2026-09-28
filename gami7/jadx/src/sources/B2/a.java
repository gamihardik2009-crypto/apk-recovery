package B2;

import C0.C;
import C0.D;
import C0.K;
import C0.t;
import C0.u;
import C1.y;
import H0.i;
import H0.j;
import H0.q;
import J.C0285q;
import J.C0291t0;
import J.V0;
import J0.b;
import J0.c;
import J2.r;
import N0.d;
import N0.e;
import N0.l;
import N0.m;
import N0.n;
import N0.o;
import N0.p;
import O0.k;
import Y1.H;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import androidx.compose.ui.draw.ShadowGraphicsLayerElement;
import b0.AbstractC0503a;
import b1.AbstractC0542s;
import b1.C0541r;
import c0.AbstractC0562B;
import c0.C0575O;
import c0.C0578S;
import c0.C0603v;
import c0.InterfaceC0576P;
import com.example.bulksmsscheduler.R;
import e0.AbstractC0655e;
import e0.g;
import h1.C0698b;
import i0.AbstractC0732y;
import i0.C0711d;
import i0.C0712e;
import java.io.IOException;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import l.C0790E;
import l.C0791F;
import l.C0798g;
import l.C0811u;
import l.S;
import m2.C0865g;
import m2.C0869k;
import m2.C0870l;
import m2.C0877s;
import m2.C0881w;
import m2.EnumC0863e;
import m2.InterfaceC0862d;
import n2.AbstractC0960l;
import p.X;
import t0.AbstractC1248f;
import t0.AbstractC1256n;
import t0.C1236E;
import t0.m0;
import z2.h;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static C0712e f315a = null;

    /* renamed from: b, reason: collision with root package name */
    public static C0712e f316b = null;

    /* renamed from: c, reason: collision with root package name */
    public static C0712e f317c = null;

    /* renamed from: d, reason: collision with root package name */
    public static C0712e f318d = null;

    /* renamed from: e, reason: collision with root package name */
    public static C0712e f319e = null;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f320f = false;

    /* renamed from: g, reason: collision with root package name */
    public static Method f321g;

    public static C0698b A(MappedByteBuffer mappedByteBuffer) {
        long j3;
        ByteBuffer duplicate = mappedByteBuffer.duplicate();
        duplicate.order(ByteOrder.BIG_ENDIAN);
        duplicate.position(duplicate.position() + 4);
        int i2 = duplicate.getShort() & 65535;
        if (i2 > 100) {
            throw new IOException("Cannot read metadata.");
        }
        duplicate.position(duplicate.position() + 6);
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                j3 = -1;
                break;
            }
            int i4 = duplicate.getInt();
            duplicate.position(duplicate.position() + 4);
            j3 = duplicate.getInt() & 4294967295L;
            duplicate.position(duplicate.position() + 4);
            if (1835365473 == i4) {
                break;
            }
            i3++;
        }
        if (j3 != -1) {
            duplicate.position(duplicate.position() + ((int) (j3 - duplicate.position())));
            duplicate.position(duplicate.position() + 12);
            long j4 = duplicate.getInt() & 4294967295L;
            for (int i5 = 0; i5 < j4; i5++) {
                int i6 = duplicate.getInt();
                long j5 = duplicate.getInt() & 4294967295L;
                duplicate.getInt();
                if (1164798569 == i6 || 1701669481 == i6) {
                    duplicate.position((int) (j5 + j3));
                    C0698b c0698b = new C0698b();
                    duplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int position = duplicate.position() + duplicate.getInt(duplicate.position());
                    c0698b.f7787k = duplicate;
                    c0698b.f7784h = position;
                    int i7 = position - duplicate.getInt(position);
                    c0698b.f7785i = i7;
                    c0698b.f7786j = ((ByteBuffer) c0698b.f7787k).getShort(i7);
                    return c0698b;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    public static List B(Resources resources, int i2) {
        if (i2 == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i2);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (V0.a.a(obtainTypedArray, 0) == 1) {
                for (int i3 = 0; i3 < obtainTypedArray.length(); i3++) {
                    int resourceId = obtainTypedArray.getResourceId(i3, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i2);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    public static final K C(K k3, k kVar) {
        int i2;
        C c3 = k3.f475a;
        m mVar = D.f446d;
        m mVar2 = c3.f427a;
        mVar2.getClass();
        if (h.a(mVar2, l.f4998a)) {
            mVar2 = D.f446d;
        }
        m mVar3 = mVar2;
        long j3 = c3.f428b;
        if (B1.C.c0(j3)) {
            j3 = D.f443a;
        }
        long j4 = j3;
        H0.k kVar2 = c3.f429c;
        if (kVar2 == null) {
            kVar2 = H0.k.f3401j;
        }
        H0.k kVar3 = kVar2;
        i iVar = c3.f430d;
        i iVar2 = new i(iVar != null ? iVar.f3398a : 0);
        j jVar = c3.f431e;
        j jVar2 = new j(jVar != null ? jVar.f3399a : 1);
        q qVar = c3.f432f;
        if (qVar == null) {
            qVar = q.f3408a;
        }
        q qVar2 = qVar;
        String str = c3.f433g;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        long j5 = c3.f434h;
        if (B1.C.c0(j5)) {
            j5 = D.f444b;
        }
        N0.a aVar = c3.f435i;
        N0.a aVar2 = new N0.a(aVar != null ? aVar.f4976a : 0.0f);
        n nVar = c3.f436j;
        if (nVar == null) {
            nVar = n.f4999c;
        }
        n nVar2 = nVar;
        b bVar = c3.f437k;
        if (bVar == null) {
            b bVar2 = b.f4322j;
            bVar = c.f4325a.c();
        }
        b bVar3 = bVar;
        long j6 = c3.f438l;
        if (j6 == 16) {
            j6 = D.f445c;
        }
        long j7 = j6;
        N0.j jVar3 = c3.f439m;
        if (jVar3 == null) {
            jVar3 = N0.j.f4993b;
        }
        N0.j jVar4 = jVar3;
        C0575O c0575o = c3.f440n;
        if (c0575o == null) {
            c0575o = C0575O.f7219d;
        }
        C0575O c0575o2 = c0575o;
        AbstractC0655e abstractC0655e = c3.f442p;
        if (abstractC0655e == null) {
            abstractC0655e = g.f7556a;
        }
        C c4 = new C(mVar3, j4, kVar3, iVar2, jVar2, qVar2, str2, j5, aVar2, nVar2, bVar3, j7, jVar4, c0575o2, c3.f441o, abstractC0655e);
        int i3 = u.f553b;
        t tVar = k3.f476b;
        int i4 = 5;
        int i5 = N0.i.a(tVar.f543a, Integer.MIN_VALUE) ? 5 : tVar.f543a;
        int i6 = tVar.f544b;
        if (N0.k.a(i6, 3)) {
            int ordinal = kVar.ordinal();
            if (ordinal == 0) {
                i4 = 4;
                i2 = 1;
            } else {
                if (ordinal != 1) {
                    throw new r();
                }
                i2 = 1;
            }
        } else if (N0.k.a(i6, Integer.MIN_VALUE)) {
            int ordinal2 = kVar.ordinal();
            if (ordinal2 != 0) {
                i2 = 1;
                if (ordinal2 != 1) {
                    throw new r();
                }
                i4 = 2;
            } else {
                i2 = 1;
                i4 = 1;
            }
        } else {
            i2 = 1;
            i4 = i6;
        }
        long j8 = tVar.f545c;
        if (B1.C.c0(j8)) {
            j8 = u.f552a;
        }
        o oVar = tVar.f546d;
        if (oVar == null) {
            oVar = o.f5002c;
        }
        int i7 = tVar.f549g;
        if (i7 == 0) {
            i7 = e.f4981b;
        }
        int i8 = tVar.f550h;
        if (d.a(i8, Integer.MIN_VALUE)) {
            i8 = i2;
        }
        p pVar = tVar.f551i;
        if (pVar == null) {
            pVar = p.f5005c;
        }
        return new K(c4, new t(i5, i4, j8, oVar, tVar.f547e, tVar.f548f, i7, i8, pVar), k3.f477c);
    }

    public static int D(float f3) {
        if (Float.isNaN(f3)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f3);
    }

    public static long E(double d3) {
        if (Double.isNaN(d3)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(d3);
    }

    public static V.o F(V.o oVar, float f3, InterfaceC0576P interfaceC0576P, int i2) {
        boolean z3;
        if ((i2 & 4) != 0) {
            z3 = Float.compare(f3, (float) 0) > 0;
        } else {
            z3 = false;
        }
        long j3 = AbstractC0562B.f7181a;
        return (Float.compare(f3, (float) 0) > 0 || z3) ? oVar.k(new ShadowGraphicsLayerElement(f3, interfaceC0576P, z3, j3, j3)) : oVar;
    }

    public static final long G(int i2, I2.c cVar) {
        h.f(cVar, "unit");
        if (cVar.compareTo(I2.c.SECONDS) <= 0) {
            long l3 = y.l(i2, cVar, I2.c.NANOSECONDS) << 1;
            int i3 = I2.a.f3959j;
            int i4 = I2.b.f3960a;
            return l3;
        }
        long j3 = i2;
        I2.c cVar2 = I2.c.NANOSECONDS;
        long l4 = y.l(4611686018426999999L, cVar2, cVar);
        if ((-l4) <= j3 && j3 <= l4) {
            long l5 = y.l(j3, cVar, cVar2) << 1;
            int i5 = I2.a.f3959j;
            int i6 = I2.b.f3960a;
            return l5;
        }
        I2.c cVar3 = I2.c.MILLISECONDS;
        h.f(cVar3, "targetUnit");
        long D3 = (B1.C.D(cVar3.f3965h.convert(j3, cVar.f3965h), -4611686018427387903L, 4611686018427387903L) << 1) + 1;
        int i7 = I2.a.f3959j;
        int i8 = I2.b.f3960a;
        return D3;
    }

    public static final C0811u H(C0790E c0790e, C0791F c0791f) {
        return new C0811u(c0790e, c0791f, 0.0f, new S(true, C0798g.f8210j));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(java.lang.Object r19, V.o r20, y2.c r21, V.c r22, java.lang.String r23, y2.c r24, y2.g r25, J.C0285q r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: B2.a.a(java.lang.Object, V.o, y2.c, V.c, java.lang.String, y2.c, y2.g, J.q, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x02c1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x023f A[LOOP:2: B:150:0x023d->B:151:0x023f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0135 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02a6 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(m.p0 r19, V.o r20, y2.c r21, V.c r22, y2.c r23, y2.g r24, J.C0285q r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 1060
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: B2.a.b(m.p0, V.o, y2.c, V.c, y2.c, y2.g, J.q, int, int):void");
    }

    public static L2.g c(int i2, int i3, int i4) {
        L2.g rVar;
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = 1;
        }
        if (i2 != -2) {
            if (i2 == -1) {
                if (i3 == 1) {
                    return new L2.r(1, 2, null);
                }
                throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
            }
            if (i2 != 0) {
                return i2 != Integer.MAX_VALUE ? i3 == 1 ? new L2.g(i2, null) : new L2.r(i2, i3, null) : new L2.g(Integer.MAX_VALUE, null);
            }
            rVar = i3 == 1 ? new L2.g(0, null) : new L2.r(1, i3, null);
        } else if (i3 == 1) {
            L2.k.f4736d.getClass();
            rVar = new L2.g(L2.j.f4735b, null);
        } else {
            rVar = new L2.r(1, i3, null);
        }
        return rVar;
    }

    public static final long d(float f3, float f4) {
        long floatToRawIntBits = (Float.floatToRawIntBits(f4) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32);
        int i2 = AbstractC0503a.f7053b;
        return floatToRawIntBits;
    }

    public static O0.c e() {
        return new O0.c(1.0f, 1.0f);
    }

    public static final void f(n1.y yVar, H h2, C0285q c0285q, int i2) {
        h.f(yVar, "navController");
        h.f(h2, "homeViewModel");
        c0285q.W(-1607029215);
        AbstractC0960l.c(yVar, S1.h.f5613d.f5618a, null, null, null, null, null, null, null, null, new S1.c(yVar, 0, h2), c0285q, 8, 0, 1020);
        C0291t0 t3 = c0285q.t();
        if (t3 != null) {
            t3.f4235d = new S1.d(yVar, h2, i2, 0);
        }
    }

    public static final A0.q g(C1236E c1236e, boolean z3) {
        V.n nVar = (V.n) c1236e.f10378C.f4244f;
        Object obj = null;
        if ((nVar.f5861k & 8) != 0) {
            loop0: while (true) {
                if (nVar == null) {
                    break;
                }
                if ((nVar.f5860j & 8) != 0) {
                    V.n nVar2 = nVar;
                    L.d dVar = null;
                    while (nVar2 != null) {
                        if (nVar2 instanceof m0) {
                            obj = nVar2;
                            break loop0;
                        }
                        if ((nVar2.f5860j & 8) != 0 && (nVar2 instanceof AbstractC1256n)) {
                            int i2 = 0;
                            for (V.n nVar3 = ((AbstractC1256n) nVar2).f10608v; nVar3 != null; nVar3 = nVar3.f5863m) {
                                if ((nVar3.f5860j & 8) != 0) {
                                    i2++;
                                    if (i2 == 1) {
                                        nVar2 = nVar3;
                                    } else {
                                        if (dVar == null) {
                                            dVar = new L.d(new V.n[16]);
                                        }
                                        if (nVar2 != null) {
                                            dVar.b(nVar2);
                                            nVar2 = null;
                                        }
                                        dVar.b(nVar3);
                                    }
                                }
                            }
                            if (i2 == 1) {
                            }
                        }
                        nVar2 = AbstractC1248f.f(dVar);
                    }
                }
                if ((nVar.f5861k & 8) == 0) {
                    break;
                }
                nVar = nVar.f5863m;
            }
        }
        h.c(obj);
        V.n nVar4 = ((V.n) ((m0) obj)).f5858h;
        A0.k o3 = c1236e.o();
        h.c(o3);
        return new A0.q(nVar4, z3, c1236e, o3);
    }

    public static final long h(float f3, float f4) {
        return (Float.floatToRawIntBits(f4) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32);
    }

    public static final Bundle i(C0865g... c0865gArr) {
        Bundle bundle = new Bundle(c0865gArr.length);
        for (C0865g c0865g : c0865gArr) {
            String str = (String) c0865g.f8646h;
            Object obj = c0865g.f8647i;
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Number) obj).byteValue());
            } else if (obj instanceof Character) {
                bundle.putChar(str, ((Character) obj).charValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Number) obj).floatValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Number) obj).longValue());
            } else if (obj instanceof Short) {
                bundle.putShort(str, ((Number) obj).shortValue());
            } else if (obj instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else if (obj instanceof Object[]) {
                Class<?> componentType = obj.getClass().getComponentType();
                h.c(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) obj);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) obj);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + '\"');
                    }
                    bundle.putSerializable(str, (Serializable) obj);
                }
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            } else if (obj instanceof IBinder) {
                bundle.putBinder(str, (IBinder) obj);
            } else if (obj instanceof Size) {
                Y0.a.a(bundle, str, (Size) obj);
            } else {
                if (!(obj instanceof SizeF)) {
                    throw new IllegalArgumentException("Illegal value type " + obj.getClass().getCanonicalName() + " for key \"" + str + '\"');
                }
                Y0.a.b(bundle, str, (SizeF) obj);
            }
        }
        return bundle;
    }

    public static void j(int i2) {
        if (2 > i2 || i2 >= 37) {
            StringBuilder l3 = B1.t.l("radix ", i2, " was not in valid range ");
            l3.append(new E2.d(2, 36, 1));
            throw new IllegalArgumentException(l3.toString());
        }
    }

    public static final void k(long j3, X x2) {
        if (x2 == X.f9518h) {
            if (O0.a.g(j3) == Integer.MAX_VALUE) {
                throw new IllegalStateException("Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There are could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.".toString());
            }
        } else if (O0.a.h(j3) == Integer.MAX_VALUE) {
            throw new IllegalStateException("Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There are could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.".toString());
        }
    }

    public static int l(char c3) {
        int digit = Character.digit((int) c3, 10);
        if (digit >= 0) {
            return digit;
        }
        throw new IllegalArgumentException("Char " + c3 + " is not a decimal digit");
    }

    public static boolean m(View view, KeyEvent keyEvent) {
        WeakReference weakReference;
        ArrayList arrayList;
        int size;
        int indexOfKey;
        int i2 = AbstractC0542s.f7132a;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList2 = C0541r.f7128d;
        C0541r c0541r = (C0541r) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (c0541r == null) {
            c0541r = new C0541r();
            c0541r.f7129a = null;
            c0541r.f7130b = null;
            c0541r.f7131c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, c0541r);
        }
        WeakReference weakReference2 = c0541r.f7131c;
        if (weakReference2 != null && weakReference2.get() == keyEvent) {
            return false;
        }
        c0541r.f7131c = new WeakReference(keyEvent);
        if (c0541r.f7130b == null) {
            c0541r.f7130b = new SparseArray();
        }
        SparseArray sparseArray = c0541r.f7130b;
        if (keyEvent.getAction() != 1 || (indexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) < 0) {
            weakReference = null;
        } else {
            weakReference = (WeakReference) sparseArray.valueAt(indexOfKey);
            sparseArray.removeAt(indexOfKey);
        }
        if (weakReference == null) {
            weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
        }
        if (weakReference == null) {
            return false;
        }
        View view2 = (View) weakReference.get();
        if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
            return true;
        }
        B1.t.w(arrayList.get(size));
        throw null;
    }

    public static final boolean n(char c3, char c4, boolean z3) {
        if (c3 == c4) {
            return true;
        }
        if (!z3) {
            return false;
        }
        char upperCase = Character.toUpperCase(c3);
        char upperCase2 = Character.toUpperCase(c4);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static final boolean o(int i2, int i3) {
        return i2 == i3;
    }

    public static final boolean p(int i2, int i3) {
        return i2 == i3;
    }

    public static final float q(float f3) {
        float intBitsToFloat = Float.intBitsToFloat(((int) ((Float.floatToRawIntBits(f3) & 8589934591L) / 3)) + 709952852);
        float f4 = intBitsToFloat - ((intBitsToFloat - (f3 / (intBitsToFloat * intBitsToFloat))) * 0.33333334f);
        return f4 - ((f4 - (f3 / (f4 * f4))) * 0.33333334f);
    }

    public static final C0712e r() {
        C0712e c0712e = f316b;
        if (c0712e != null) {
            return c0712e;
        }
        C0711d c0711d = new C0711d("Filled.Add", false);
        int i2 = AbstractC0732y.f7958a;
        C0578S c0578s = new C0578S(C0603v.f7272b);
        V0 v0 = new V0(1);
        v0.h(19.0f, 13.0f);
        v0.e(-6.0f);
        v0.l(6.0f);
        v0.e(-2.0f);
        v0.l(-6.0f);
        v0.d(5.0f);
        v0.l(-2.0f);
        v0.e(6.0f);
        v0.k(5.0f);
        v0.e(2.0f);
        v0.l(6.0f);
        v0.e(6.0f);
        v0.l(2.0f);
        v0.a();
        C0711d.a(c0711d, v0.f4104h, c0578s);
        C0712e b3 = c0711d.b();
        f316b = b3;
        return b3;
    }

    public static final C0712e s() {
        C0712e c0712e = f317c;
        if (c0712e != null) {
            return c0712e;
        }
        C0711d c0711d = new C0711d("Filled.Close", false);
        int i2 = AbstractC0732y.f7958a;
        C0578S c0578s = new C0578S(C0603v.f7272b);
        V0 v0 = new V0(1);
        v0.h(19.0f, 6.41f);
        v0.f(17.59f, 5.0f);
        v0.f(12.0f, 10.59f);
        v0.f(6.41f, 5.0f);
        v0.f(5.0f, 6.41f);
        v0.f(10.59f, 12.0f);
        v0.f(5.0f, 17.59f);
        v0.f(6.41f, 19.0f);
        v0.f(12.0f, 13.41f);
        v0.f(17.59f, 19.0f);
        v0.f(19.0f, 17.59f);
        v0.f(13.41f, 12.0f);
        v0.a();
        C0711d.a(c0711d, v0.f4104h, c0578s);
        C0712e b3 = c0711d.b();
        f317c = b3;
        return b3;
    }

    public static final C0712e t() {
        C0712e c0712e = f318d;
        if (c0712e != null) {
            return c0712e;
        }
        C0711d c0711d = new C0711d("Filled.Info", false);
        int i2 = AbstractC0732y.f7958a;
        C0578S c0578s = new C0578S(C0603v.f7272b);
        V0 v0 = new V0(1);
        v0.h(12.0f, 2.0f);
        v0.b(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        v0.j(4.48f, 10.0f, 10.0f, 10.0f);
        v0.j(10.0f, -4.48f, 10.0f, -10.0f);
        v0.i(17.52f, 2.0f, 12.0f, 2.0f);
        v0.a();
        v0.h(13.0f, 17.0f);
        v0.e(-2.0f);
        v0.l(-6.0f);
        v0.e(2.0f);
        v0.l(6.0f);
        v0.a();
        v0.h(13.0f, 9.0f);
        v0.e(-2.0f);
        v0.f(11.0f, 7.0f);
        v0.e(2.0f);
        v0.l(2.0f);
        v0.a();
        C0711d.a(c0711d, v0.f4104h, c0578s);
        C0712e b3 = c0711d.b();
        f318d = b3;
        return b3;
    }

    public static final m0 u(C1236E c1236e) {
        V.n nVar = (V.n) c1236e.f10378C.f4244f;
        Object obj = null;
        if ((nVar.f5861k & 8) != 0) {
            loop0: while (true) {
                if (nVar == null) {
                    break;
                }
                if ((nVar.f5860j & 8) != 0) {
                    V.n nVar2 = nVar;
                    L.d dVar = null;
                    while (nVar2 != null) {
                        if (nVar2 instanceof m0) {
                            if (((m0) nVar2).d0()) {
                                obj = nVar2;
                                break loop0;
                            }
                        } else if ((nVar2.f5860j & 8) != 0 && (nVar2 instanceof AbstractC1256n)) {
                            int i2 = 0;
                            for (V.n nVar3 = ((AbstractC1256n) nVar2).f10608v; nVar3 != null; nVar3 = nVar3.f5863m) {
                                if ((nVar3.f5860j & 8) != 0) {
                                    i2++;
                                    if (i2 == 1) {
                                        nVar2 = nVar3;
                                    } else {
                                        if (dVar == null) {
                                            dVar = new L.d(new V.n[16]);
                                        }
                                        if (nVar2 != null) {
                                            dVar.b(nVar2);
                                            nVar2 = null;
                                        }
                                        dVar.b(nVar3);
                                    }
                                }
                            }
                            if (i2 == 1) {
                            }
                        }
                        nVar2 = AbstractC1248f.f(dVar);
                    }
                }
                if ((nVar.f5861k & 8) == 0) {
                    break;
                }
                nVar = nVar.f5863m;
            }
        }
        return (m0) obj;
    }

    public static final N0.h v(C0.H h2, int i2) {
        if (h2.f461a.f451a.length() != 0) {
            int e3 = h2.e(i2);
            if ((i2 != 0 && e3 == h2.e(i2 - 1)) || (i2 != h2.f461a.f451a.f500a.length() && e3 == h2.e(i2 + 1))) {
                return h2.a(i2);
            }
        }
        return h2.i(i2);
    }

    public static boolean w(char c3) {
        return Character.isWhitespace(c3) || Character.isSpaceChar(c3);
    }

    public static InterfaceC0862d x(EnumC0863e enumC0863e, y2.a aVar) {
        int ordinal = enumC0863e.ordinal();
        if (ordinal == 0) {
            return new C0870l(aVar);
        }
        C0877s c0877s = C0877s.f8656a;
        if (ordinal == 1) {
            C0869k c0869k = new C0869k();
            c0869k.f8650h = aVar;
            c0869k.f8651i = c0877s;
            return c0869k;
        }
        if (ordinal != 2) {
            throw new r();
        }
        C0881w c0881w = new C0881w();
        c0881w.f8658h = aVar;
        c0881w.f8659i = c0877s;
        return c0881w;
    }

    public static final float y(float f3, float f4, float f5) {
        return (f5 * f4) + ((1 - f5) * f3);
    }

    public static final int z(float f3, int i2, int i3) {
        return i2 + ((int) Math.round((i3 - i2) * f3));
    }
}
