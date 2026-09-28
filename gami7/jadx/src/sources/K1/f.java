package K1;

import B1.C;
import B1.C0013c;
import B1.t;
import C0.K;
import C1.y;
import D.C0032a;
import D.C0035d;
import D.C0036e;
import D.C0037f;
import D.C0038g;
import D.C0041j;
import D.C0044m;
import D.E;
import D.InterfaceC0045n;
import D.P;
import H.AbstractC0088d2;
import H.AbstractC0107g0;
import H.AbstractC0124i3;
import H.AbstractC0162o;
import H.C0078c;
import H.C0093e0;
import H.D1;
import H.O5;
import H.P5;
import H.t5;
import J.C0257c;
import J.C0275l;
import J.C0285q;
import J.C0291t0;
import J.InterfaceC0258c0;
import J.InterfaceC0259d;
import J.InterfaceC0282o0;
import J.W;
import J.X0;
import J2.AbstractC0304a;
import O2.AbstractC0369a;
import R0.B;
import W1.C0380a;
import W1.C0381b;
import W1.C0383d;
import W1.C0387h;
import W1.C0389j;
import W1.C0390k;
import W1.C0391l;
import a.AbstractC0423a;
import android.content.Context;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.text.Layout;
import android.view.View;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.InterfaceC0461j;
import androidx.lifecycle.c0;
import c0.C0578S;
import c0.C0603v;
import com.example.bulksmsscheduler.R;
import com.example.bulksmsscheduler.SmsApplication;
import f1.C0673a;
import i0.AbstractC0732y;
import i0.C0711d;
import i0.C0712e;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import k1.C0783a;
import l0.C0813a;
import l1.AbstractC0815b;
import m.AbstractC0837j;
import m2.C0880v;
import n.AbstractC0916y;
import n.C0905m;
import n.g0;
import n.h0;
import n.i0;
import n.j0;
import n2.AbstractC0948C;
import n2.AbstractC0949a;
import p.InterfaceC1047v0;
import p.U;
import p.X;
import s.AbstractC1166e;
import s.AbstractC1173l;
import s.C1168g;
import s.Q;
import s.S;
import t0.AbstractC1265x;
import t0.C1250h;
import t0.C1251i;
import t0.C1252j;
import t0.InterfaceC1253k;
import u0.AbstractC1296l0;
import u0.V0;
import y.C1396d;
import z2.v;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static C0712e f4538a;

    /* renamed from: b, reason: collision with root package name */
    public static C0712e f4539b;

    /* renamed from: c, reason: collision with root package name */
    public static C0712e f4540c;

    /* renamed from: d, reason: collision with root package name */
    public static C0712e f4541d;

    public static final int A(int i2) {
        if (i2 == 0) {
            return 1;
        }
        if (i2 == 1) {
            return 2;
        }
        throw new IllegalArgumentException("Could not convert " + i2 + " to BackoffPolicy");
    }

    public static final int B(int i2) {
        if (i2 == 0) {
            return 1;
        }
        int i3 = 2;
        if (i2 != 1) {
            if (i2 == 2) {
                return 3;
            }
            i3 = 4;
            if (i2 != 3) {
                if (i2 == 4) {
                    return 5;
                }
                if (Build.VERSION.SDK_INT >= 30 && i2 == 5) {
                    return 6;
                }
                throw new IllegalArgumentException("Could not convert " + i2 + " to NetworkType");
            }
        }
        return i3;
    }

    public static final int C(int i2) {
        if (i2 == 0) {
            return 1;
        }
        if (i2 == 1) {
            return 2;
        }
        throw new IllegalArgumentException("Could not convert " + i2 + " to OutOfQuotaPolicy");
    }

    public static final int D(int i2) {
        if (i2 == 0) {
            return 1;
        }
        int i3 = 2;
        if (i2 != 1) {
            if (i2 == 2) {
                return 3;
            }
            i3 = 4;
            if (i2 != 3) {
                if (i2 == 4) {
                    return 5;
                }
                if (i2 == 5) {
                    return 6;
                }
                throw new IllegalArgumentException("Could not convert " + i2 + " to State");
            }
        }
        return i3;
    }

    public static final boolean E(long j3) {
        long j4 = (j3 & 9187343241974906880L) ^ 9187343241974906880L;
        return (((~j4) & (j4 - 4294967297L)) & (-9223372034707292160L)) == 0;
    }

    public static final boolean F(long j3) {
        return (j3 & 9223372034707292159L) != 9205357640488583168L;
    }

    public static final boolean G(long j3) {
        return (j3 & 9223372034707292159L) == 9205357640488583168L;
    }

    public static final long H(long j3, long j4, float f3) {
        float y3 = B2.a.y(Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j4 >> 32)), f3);
        float y4 = B2.a.y(Float.intBitsToFloat((int) (j3 & 4294967295L)), Float.intBitsToFloat((int) (j4 & 4294967295L)), f3);
        return (Float.floatToRawIntBits(y3) << 32) | (Float.floatToRawIntBits(y4) & 4294967295L);
    }

    public static final e I(y2.e eVar, y2.c cVar) {
        C0078c c0078c = new C0078c(eVar, 9);
        v.d(1, cVar);
        e eVar2 = S.n.f5572a;
        return new e(c0078c, cVar);
    }

    public static MappedByteBuffer J(Context context, Uri uri) {
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                try {
                    FileChannel channel = fileInputStream.getChannel();
                    MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                    fileInputStream.close();
                    openFileDescriptor.close();
                    return map;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    public static final int K(int i2) {
        AbstractC1265x.f("networkType", i2);
        int d3 = AbstractC0837j.d(i2);
        if (d3 == 0) {
            return 0;
        }
        if (d3 == 1) {
            return 1;
        }
        if (d3 == 2) {
            return 2;
        }
        if (d3 == 3) {
            return 3;
        }
        if (d3 == 4) {
            return 4;
        }
        if (Build.VERSION.SDK_INT >= 30 && i2 == 6) {
            return 5;
        }
        throw new IllegalArgumentException("Could not convert " + t.B(i2) + " to int");
    }

    public static final V.o L(V.o oVar, InterfaceC1047v0 interfaceC1047v0, X x2, boolean z3, boolean z4, U u3, r.l lVar, C0285q c0285q) {
        j0 j0Var;
        Context context = (Context) c0285q.l(AndroidCompositionLocals_androidKt.f6781b);
        h0 h0Var = (h0) c0285q.l(i0.f8791a);
        if (h0Var != null) {
            c0285q.U(1586021609);
            boolean g3 = c0285q.g(context) | c0285q.g(h0Var);
            Object K3 = c0285q.K();
            if (g3 || K3 == C0275l.f4150a) {
                K3 = new C0905m(context, h0Var);
                c0285q.e0(K3);
            }
            c0285q.r(false);
            j0Var = (C0905m) K3;
        } else {
            c0285q.U(1586120933);
            c0285q.r(false);
            j0Var = g0.f8783j;
        }
        X x3 = X.f9518h;
        V.o k3 = oVar.k(x2 == x3 ? AbstractC0916y.f8898c : AbstractC0916y.f8897b).k(j0Var.a());
        boolean z5 = !z4;
        if (((O0.k) c0285q.l(AbstractC1296l0.f11093l)) == O0.k.f5149i && x2 != x3) {
            z5 = z4;
        }
        return androidx.compose.foundation.gestures.a.b(k3, interfaceC1047v0, x2, j0Var, z3, z5, u3, lVar, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:145:0x0140, code lost:
    
        if (r13 == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x00f5, code lost:
    
        if (r13 == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0074, code lost:
    
        if (r4 != null) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01cd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0249 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b3 A[Catch: NoSuchFieldException -> 0x01cb, TryCatch #3 {NoSuchFieldException -> 0x01cb, blocks: (B:79:0x01a5, B:81:0x01b3, B:90:0x01d3, B:86:0x01c8), top: B:78:0x01a5 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01d3 A[Catch: NoSuchFieldException -> 0x01cb, TRY_LEAVE, TryCatch #3 {NoSuchFieldException -> 0x01cb, blocks: (B:79:0x01a5, B:81:0x01b3, B:90:0x01d3, B:86:0x01c8), top: B:78:0x01a5 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01e5 A[Catch: NoSuchFieldException -> 0x01e8, TRY_LEAVE, TryCatch #2 {NoSuchFieldException -> 0x01e8, blocks: (B:94:0x01da, B:95:0x01e1, B:97:0x01e5), top: B:93:0x01da }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x021b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final T2.a M(F2.b r17) {
        /*
            Method dump skipped, instructions count: 586
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: K1.f.M(F2.b):T2.a");
    }

    public static final byte[] O(Set set) {
        z2.h.f(set, "triggers");
        if (set.isEmpty()) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                objectOutputStream.writeInt(set.size());
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    C0013c c0013c = (C0013c) it.next();
                    objectOutputStream.writeUTF(c0013c.f272a.toString());
                    objectOutputStream.writeBoolean(c0013c.f273b);
                }
                AbstractC0949a.h(objectOutputStream, null);
                AbstractC0949a.h(byteArrayOutputStream, null);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                z2.h.e(byteArray, "outputStream.toByteArray()");
                return byteArray;
            } finally {
            }
        } finally {
        }
    }

    public static void P(y2.e eVar, AbstractC0304a abstractC0304a, AbstractC0304a abstractC0304a2) {
        try {
            AbstractC0369a.h(AbstractC0948C.i(AbstractC0948C.g(abstractC0304a, abstractC0304a2, eVar)), C0880v.f8657a, null);
        } catch (Throwable th) {
            abstractC0304a2.t(y.n(th));
            throw th;
        }
    }

    public static final int Q(int i2) {
        AbstractC1265x.f("state", i2);
        int d3 = AbstractC0837j.d(i2);
        if (d3 == 0) {
            return 0;
        }
        if (d3 == 1) {
            return 1;
        }
        if (d3 == 2) {
            return 2;
        }
        if (d3 == 3) {
            return 3;
        }
        if (d3 == 4) {
            return 4;
        }
        if (d3 == 5) {
            return 5;
        }
        throw new J2.r();
    }

    public static final void R(String str) {
        throw new IllegalArgumentException(str);
    }

    public static String S(int i2) {
        return t(i2, 1) ? "Clip" : t(i2, 2) ? "Ellipsis" : t(i2, 3) ? "Visible" : "Invalid";
    }

    public static final double T(long j3) {
        return ((j3 >>> 11) * 2048) + (j3 & 2047);
    }

    public static final void a(R1.e eVar, y2.a aVar, y2.f fVar, C0285q c0285q, int i2) {
        int i3;
        String str;
        String str2;
        String str3;
        z2.h.f(aVar, "onDismiss");
        c0285q.W(462410566);
        if ((i2 & 14) == 0) {
            i3 = (c0285q.g(eVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= c0285q.i(aVar) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i3 |= c0285q.i(fVar) ? 256 : 128;
        }
        int i4 = i3;
        if ((i4 & 731) == 146 && c0285q.A()) {
            c0285q.P();
        } else {
            c0285q.U(-1146603655);
            Object K3 = c0285q.K();
            W w2 = C0275l.f4150a;
            W w3 = W.f4109m;
            String str4 = "";
            if (K3 == w2) {
                if (eVar == null || (str3 = eVar.f5491b) == null) {
                    str3 = "";
                }
                K3 = C0257c.N(str3, w3);
                c0285q.e0(K3);
            }
            InterfaceC0258c0 interfaceC0258c0 = (InterfaceC0258c0) K3;
            Object g3 = t.g(c0285q, false, -1146601380);
            if (g3 == w2) {
                if (eVar == null || (str2 = eVar.f5492c) == null) {
                    str2 = "";
                }
                g3 = C0257c.N(str2, w3);
                c0285q.e0(g3);
            }
            InterfaceC0258c0 interfaceC0258c02 = (InterfaceC0258c0) g3;
            Object g4 = t.g(c0285q, false, -1146599045);
            if (g4 == w2) {
                if (eVar != null && (str = eVar.f5493d) != null) {
                    str4 = str;
                }
                g4 = C0257c.N(str4, w3);
                c0285q.e0(g4);
            }
            InterfaceC0258c0 interfaceC0258c03 = (InterfaceC0258c0) g4;
            c0285q.r(false);
            AbstractC0162o.a(aVar, R.b.c(-1835026546, new C0390k(fVar, interfaceC0258c0, interfaceC0258c02, interfaceC0258c03, 2), c0285q), null, R.b.c(690469136, new C0387h(aVar, 2), c0285q), null, R.b.c(-1079002478, new d2.f(eVar, 0), c0285q), R.b.c(-1963738285, new C0391l(interfaceC0258c0, interfaceC0258c02, interfaceC0258c03, 5), c0285q), null, 0L, 0L, 0L, 0L, 0.0f, null, c0285q, ((i4 >> 3) & 14) | 1772592, 0, 16276);
        }
        C0291t0 t3 = c0285q.t();
        if (t3 != null) {
            t3.f4235d = new C0380a(eVar, aVar, fVar, i2, 5);
        }
    }

    public static final void b(boolean z3, y2.c cVar, R1.a aVar, C0285q c0285q, int i2) {
        int i3;
        long b3;
        c0285q.W(-1922262260);
        if ((i2 & 14) == 0) {
            i3 = (c0285q.h(z3) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= c0285q.i(cVar) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i3 |= c0285q.g(aVar) ? 256 : 128;
        }
        if ((i3 & 731) == 146 && c0285q.A()) {
            c0285q.P();
        } else {
            FillElement fillElement = androidx.compose.foundation.layout.c.f6639a;
            C1396d a3 = y.e.a(24);
            if (z3) {
                c0285q.U(182954124);
                b3 = ((C0093e0) c0285q.l(AbstractC0107g0.f2597a)).f2485c;
                c0285q.r(false);
            } else {
                c0285q.U(182957102);
                b3 = C0603v.b(0.5f, ((C0093e0) c0285q.l(AbstractC0107g0.f2597a)).f2506y);
                c0285q.r(false);
            }
            D1.b(fillElement, a3, D1.l(b3, c0285q, 0), D1.m(0, c0285q, 62), null, R.b.c(714441342, new Z1.f(z3, cVar, aVar), c0285q), c0285q, 196614, 16);
        }
        C0291t0 t3 = c0285q.t();
        if (t3 != null) {
            t3.f4235d = new C0381b(z3, cVar, aVar, i2);
        }
    }

    public static final void c(InterfaceC0045n interfaceC0045n, V.c cVar, y2.e eVar, C0285q c0285q, int i2) {
        int i3;
        c0285q.W(476043083);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? c0285q.g(interfaceC0045n) : c0285q.i(interfaceC0045n) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= c0285q.g(cVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= c0285q.i(eVar) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && c0285q.A()) {
            c0285q.P();
        } else {
            boolean z3 = false;
            boolean z4 = (i3 & 112) == 32;
            if ((i3 & 14) == 4 || ((i3 & 8) != 0 && c0285q.g(interfaceC0045n))) {
                z3 = true;
            }
            boolean z5 = z4 | z3;
            Object K3 = c0285q.K();
            if (z5 || K3 == C0275l.f4150a) {
                K3 = new C0044m(cVar, interfaceC0045n);
                c0285q.e0(K3);
            }
            R0.k.a((C0044m) K3, null, new B(false, true, true, 1, true, false), eVar, c0285q, ((i3 << 3) & 7168) | 384, 2);
        }
        C0291t0 t3 = c0285q.t();
        if (t3 != null) {
            t3.f4235d = new C0032a(interfaceC0045n, cVar, eVar, i2, 0);
        }
    }

    public static final long d(int i2) {
        long j3 = (i2 << 32) | (0 & 4294967295L);
        int i3 = C0813a.f8276n;
        return j3;
    }

    public static final long e(float f3, float f4) {
        return (Float.floatToRawIntBits(f4) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32);
    }

    public static final void f(final R1.e eVar, final d2.n nVar, final y2.a aVar, final y2.a aVar2, C0285q c0285q, final int i2) {
        z2.h.f(eVar, "template");
        z2.h.f(nVar, "viewModel");
        z2.h.f(aVar, "onEdit");
        z2.h.f(aVar2, "onDelete");
        c0285q.W(-1091736522);
        D1.b(androidx.compose.foundation.layout.c.f6639a, y.e.a(24), D1.l(((C0093e0) c0285q.l(AbstractC0107g0.f2597a)).f2498p, c0285q, 0), D1.m(2, c0285q, 62), null, R.b.c(1057828776, new d2.g(eVar, aVar2, nVar, aVar), c0285q), c0285q, 196614, 16);
        C0291t0 t3 = c0285q.t();
        if (t3 != null) {
            t3.f4235d = new y2.e() { // from class: d2.d
                @Override // y2.e
                public final Object j(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    R1.e eVar2 = R1.e.this;
                    z2.h.f(eVar2, "$template");
                    n nVar2 = nVar;
                    z2.h.f(nVar2, "$viewModel");
                    y2.a aVar3 = aVar;
                    z2.h.f(aVar3, "$onEdit");
                    y2.a aVar4 = aVar2;
                    z2.h.f(aVar4, "$onDelete");
                    K1.f.f(eVar2, nVar2, aVar3, aVar4, (C0285q) obj, C0257c.Y(i2 | 1));
                    return C0880v.f8657a;
                }
            };
        }
    }

    public static final void g(final float f3, C0285q c0285q, final int i2) {
        int i3;
        c0285q.W(2067994831);
        if ((i2 & 14) == 0) {
            i3 = (c0285q.d(f3) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 11) == 2 && c0285q.A()) {
            c0285q.P();
        } else {
            D1.b(androidx.compose.foundation.layout.c.f6639a, y.e.a(24), D1.l(((C0093e0) c0285q.l(AbstractC0107g0.f2597a)).f2490h, c0285q, 0), D1.m(0, c0285q, 62), null, R.b.c(434978625, new Y1.l(f3, 1), c0285q), c0285q, 196614, 16);
        }
        C0291t0 t3 = c0285q.t();
        if (t3 != null) {
            t3.f4235d = new y2.e() { // from class: Z1.d
                @Override // y2.e
                public final Object j(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int Y2 = C0257c.Y(i2 | 1);
                    K1.f.g(f3, (C0285q) obj, Y2);
                    return C0880v.f8657a;
                }
            };
        }
    }

    public static final void h(InterfaceC0045n interfaceC0045n, boolean z3, N0.h hVar, boolean z4, long j3, V.o oVar, C0285q c0285q, int i2, int i3) {
        int i4;
        long j4;
        boolean z5;
        c0285q.W(-843755800);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = ((i2 & 8) == 0 ? c0285q.g(interfaceC0045n) : c0285q.i(interfaceC0045n) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= c0285q.h(z3) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= c0285q.g(hVar) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i4 |= c0285q.h(z4) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            j4 = j3;
            i4 |= ((i3 & 16) == 0 && c0285q.f(j4)) ? 16384 : 8192;
        } else {
            j4 = j3;
        }
        if ((i3 & 32) != 0) {
            i4 |= 196608;
        } else if ((i2 & 196608) == 0) {
            i4 |= c0285q.g(oVar) ? 131072 : 65536;
        }
        if ((74899 & i4) == 74898 && c0285q.A()) {
            c0285q.P();
        } else {
            c0285q.R();
            if ((i2 & 1) != 0 && !c0285q.z()) {
                c0285q.P();
                if ((i3 & 16) != 0) {
                    i4 &= -57345;
                }
            } else if ((i3 & 16) != 0) {
                i4 &= -57345;
                j4 = 9205357640488583168L;
            }
            c0285q.s();
            N0.h hVar2 = N0.h.f4990i;
            N0.h hVar3 = N0.h.f4989h;
            if (z3) {
                float f3 = E.f723a;
                z5 = (hVar == hVar3 && !z4) || (hVar == hVar2 && z4);
            } else {
                float f4 = E.f723a;
                z5 = (hVar != hVar3 || z4) && !(hVar == hVar2 && z4);
            }
            V.d dVar = z5 ? V.a.f5829b : V.a.f5828a;
            int i5 = i4 & 14;
            boolean h2 = (i5 == 4 || ((i4 & 8) != 0 && c0285q.i(interfaceC0045n))) | ((i4 & 112) == 32) | c0285q.h(z5);
            Object K3 = c0285q.K();
            if (h2 || K3 == C0275l.f4150a) {
                K3 = new C0037f(interfaceC0045n, z3, z5);
                c0285q.e0(K3);
            }
            c(interfaceC0045n, dVar, R.b.c(280174801, new C0035d((V0) c0285q.l(AbstractC1296l0.q), j4, z5, A0.m.b(oVar, false, (y2.c) K3), interfaceC0045n), c0285q), c0285q, i5 | 384);
        }
        long j5 = j4;
        C0291t0 t3 = c0285q.t();
        if (t3 != null) {
            t3.f4235d = new C0036e(interfaceC0045n, z3, hVar, z4, j5, oVar, i2, i3);
        }
    }

    public static final void i(V.o oVar, y2.a aVar, boolean z3, C0285q c0285q, int i2) {
        int i3;
        c0285q.W(2111672474);
        if ((i2 & 6) == 0) {
            i3 = (c0285q.g(oVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= c0285q.i(aVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= c0285q.h(z3) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && c0285q.A()) {
            c0285q.P();
        } else {
            AbstractC1166e.a(c0285q, V.a.b(androidx.compose.foundation.layout.c.k(oVar, E.f723a, E.f724b), new C0041j(0, aVar, z3)));
        }
        C0291t0 t3 = c0285q.t();
        if (t3 != null) {
            t3.f4235d = new C0038g(oVar, aVar, z3, i2);
        }
    }

    public static final void j(final C0712e c0712e, final String str, final String str2, final long j3, C0285q c0285q, final int i2) {
        int i3;
        z2.h.f(str2, "value");
        c0285q.W(1778182948);
        if ((i2 & 14) == 0) {
            i3 = (c0285q.g(c0712e) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= c0285q.g(str) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i3 |= c0285q.g(str2) ? 256 : 128;
        }
        if ((i2 & 7168) == 0) {
            i3 |= c0285q.f(j3) ? 2048 : 1024;
        }
        if ((i3 & 5851) == 1170 && c0285q.A()) {
            c0285q.P();
        } else {
            V.l lVar = V.l.f5857b;
            FillElement fillElement = androidx.compose.foundation.layout.c.f6639a;
            C1168g c1168g = AbstractC1173l.f10155g;
            V.f fVar = V.b.f5840r;
            S a3 = Q.a(c1168g, fVar, c0285q, 54);
            int i4 = c0285q.f4194P;
            InterfaceC0282o0 n3 = c0285q.n();
            V.o d3 = V.a.d(c0285q, fillElement);
            InterfaceC1253k.f10606f.getClass();
            C1251i c1251i = C1252j.f10598b;
            boolean z3 = c0285q.f4195a instanceof InterfaceC0259d;
            if (!z3) {
                C0257c.I();
                throw null;
            }
            c0285q.Y();
            if (c0285q.f4193O) {
                c0285q.m(c1251i);
            } else {
                c0285q.h0();
            }
            C1250h c1250h = C1252j.f10602f;
            C0257c.V(c0285q, a3, c1250h);
            C1250h c1250h2 = C1252j.f10601e;
            C0257c.V(c0285q, n3, c1250h2);
            C1250h c1250h3 = C1252j.f10603g;
            if (c0285q.f4193O || !z2.h.a(c0285q.K(), Integer.valueOf(i4))) {
                t.q(i4, c0285q, i4, c1250h3);
            }
            C1250h c1250h4 = C1252j.f10600d;
            C0257c.V(c0285q, d3, c1250h4);
            S a4 = Q.a(AbstractC1173l.f10149a, fVar, c0285q, 48);
            int i5 = c0285q.f4194P;
            InterfaceC0282o0 n4 = c0285q.n();
            V.o d4 = V.a.d(c0285q, lVar);
            if (!z3) {
                C0257c.I();
                throw null;
            }
            c0285q.Y();
            if (c0285q.f4193O) {
                c0285q.m(c1251i);
            } else {
                c0285q.h0();
            }
            C0257c.V(c0285q, a4, c1250h);
            C0257c.V(c0285q, n4, c1250h2);
            if (c0285q.f4193O || !z2.h.a(c0285q.K(), Integer.valueOf(i5))) {
                t.q(i5, c0285q, i5, c1250h3);
            }
            C0257c.V(c0285q, d4, c1250h4);
            AbstractC0088d2.a(c0712e, null, androidx.compose.foundation.layout.c.j(lVar, 16), C0603v.b(0.6f, j3), c0285q, (i3 & 14) | 432, 0);
            AbstractC1166e.a(c0285q, androidx.compose.foundation.layout.c.n(lVar, 8));
            X0 x02 = P5.f1917a;
            int i6 = i3 >> 3;
            t5.b(str, null, C0603v.b(0.6f, j3), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((O5) c0285q.l(x02)).f1864k, c0285q, i6 & 14, 0, 65530);
            c0285q.r(true);
            t5.b(str2, null, j3, 0L, null, H0.k.f3403l, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((O5) c0285q.l(x02)).f1864k, c0285q, ((i3 >> 6) & 14) | 196608 | (i6 & 896), 0, 65498);
            c0285q.r(true);
        }
        C0291t0 t3 = c0285q.t();
        if (t3 != null) {
            t3.f4235d = new y2.e() { // from class: Z1.e
                @Override // y2.e
                public final Object j(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    C0712e c0712e2 = C0712e.this;
                    z2.h.f(c0712e2, "$icon");
                    String str3 = str;
                    z2.h.f(str3, "$label");
                    String str4 = str2;
                    z2.h.f(str4, "$value");
                    K1.f.j(c0712e2, str3, str4, j3, (C0285q) obj, C0257c.Y(i2 | 1));
                    return C0880v.f8657a;
                }
            };
        }
    }

    public static final void k(V.o oVar, y2.e eVar, C0285q c0285q, int i2, int i3) {
        int i4;
        c0285q.W(-2105228848);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (c0285q.g(oVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= c0285q.i(eVar) ? 32 : 16;
        }
        if ((i4 & 19) == 18 && c0285q.A()) {
            c0285q.P();
        } else {
            if (i5 != 0) {
                oVar = V.l.f5857b;
            }
            P p3 = P.f755a;
            int i6 = c0285q.f4194P;
            InterfaceC0282o0 n3 = c0285q.n();
            V.o d3 = V.a.d(c0285q, oVar);
            InterfaceC1253k.f10606f.getClass();
            C1251i c1251i = C1252j.f10598b;
            int i7 = (((((i4 << 3) & 112) | (((i4 >> 3) & 14) | 384)) << 6) & 896) | 6;
            if (!(c0285q.f4195a instanceof InterfaceC0259d)) {
                C0257c.I();
                throw null;
            }
            c0285q.Y();
            if (c0285q.f4193O) {
                c0285q.m(c1251i);
            } else {
                c0285q.h0();
            }
            C0257c.V(c0285q, p3, C1252j.f10602f);
            C0257c.V(c0285q, n3, C1252j.f10601e);
            C1250h c1250h = C1252j.f10603g;
            if (c0285q.f4193O || !z2.h.a(c0285q.K(), Integer.valueOf(i6))) {
                t.q(i6, c0285q, i6, c1250h);
            }
            C0257c.V(c0285q, d3, C1252j.f10600d);
            eVar.j(c0285q, Integer.valueOf((i7 >> 6) & 14));
            c0285q.r(true);
        }
        V.o oVar2 = oVar;
        C0291t0 t3 = c0285q.t();
        if (t3 != null) {
            t3.f4235d = new D.Q(oVar2, eVar, i2, i3, 0);
        }
    }

    public static final void l(n1.y yVar, C0285q c0285q, int i2) {
        z2.h.f(yVar, "navController");
        c0285q.W(-737421749);
        if ((i2 & 1) == 0 && c0285q.A()) {
            c0285q.P();
        } else {
            Context applicationContext = ((Context) c0285q.l(AndroidCompositionLocals_androidKt.f6781b)).getApplicationContext();
            z2.h.d(applicationContext, "null cannot be cast to non-null type com.example.bulksmsscheduler.SmsApplication");
            V1.b bVar = new V1.b(((SmsApplication) applicationContext).a(), null);
            c0285q.V(1729797275);
            c0 a3 = AbstractC0815b.a(c0285q);
            if (a3 == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            androidx.lifecycle.X f02 = AbstractC0423a.f0(z2.t.a(d2.n.class), a3, bVar, a3 instanceof InterfaceC0461j ? ((InterfaceC0461j) a3).a() : C0783a.f8106i, c0285q);
            c0285q.r(false);
            d2.n nVar = (d2.n) f02;
            InterfaceC0258c0 G3 = C.G(nVar.f7534c, c0285q);
            c0285q.U(-2117665471);
            Object K3 = c0285q.K();
            W w2 = C0275l.f4150a;
            W w3 = W.f4109m;
            if (K3 == w2) {
                K3 = C0257c.N(Boolean.FALSE, w3);
                c0285q.e0(K3);
            }
            InterfaceC0258c0 interfaceC0258c0 = (InterfaceC0258c0) K3;
            Object g3 = t.g(c0285q, false, -2117663502);
            if (g3 == w2) {
                g3 = C0257c.N(null, w3);
                c0285q.e0(g3);
            }
            InterfaceC0258c0 interfaceC0258c02 = (InterfaceC0258c0) g3;
            Object g4 = t.g(c0285q, false, -2117660942);
            if (g4 == w2) {
                g4 = C0257c.N(null, w3);
                c0285q.e0(g4);
            }
            c0285q.r(false);
            AbstractC0124i3.b(null, null, null, null, R.b.c(335907108, new C0389j(interfaceC0258c0, 11), c0285q), 0, 0L, 0L, null, R.b.c(831825756, new d2.i(interfaceC0258c0, interfaceC0258c02, nVar, (InterfaceC0258c0) g4, G3), c0285q), c0285q, 805330944, 495);
        }
        C0291t0 t3 = c0285q.t();
        if (t3 != null) {
            t3.f4235d = new C0383d(yVar, i2, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /* JADX WARN: Type inference failed for: r5v6, types: [y2.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m(L2.u r4, D.c0 r5, q2.InterfaceC1073d r6) {
        /*
            boolean r0 = r6 instanceof L2.s
            if (r0 == 0) goto L13
            r0 = r6
            L2.s r0 = (L2.s) r0
            int r1 = r0.f4745m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4745m = r1
            goto L18
        L13:
            L2.s r0 = new L2.s
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f4744l
            r2.a r1 = r2.EnumC1145a.f10026h
            int r2 = r0.f4745m
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            y2.a r5 = r0.f4743k
            C1.y.J(r6)     // Catch: java.lang.Throwable -> L29
            goto L69
        L29:
            r4 = move-exception
            goto L6f
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            C1.y.J(r6)
            q2.i r6 = r0.f10205i
            z2.h.c(r6)
            J2.w r2 = J2.C0325w.f4437i
            q2.g r6 = r6.s(r2)
            if (r6 != r4) goto L73
            r0.getClass()     // Catch: java.lang.Throwable -> L29
            r0.f4743k = r5     // Catch: java.lang.Throwable -> L29
            r0.f4745m = r3     // Catch: java.lang.Throwable -> L29
            J2.h r6 = new J2.h     // Catch: java.lang.Throwable -> L29
            q2.d r0 = n2.AbstractC0948C.i(r0)     // Catch: java.lang.Throwable -> L29
            r6.<init>(r3, r0)     // Catch: java.lang.Throwable -> L29
            r6.r()     // Catch: java.lang.Throwable -> L29
            A0.n r0 = new A0.n     // Catch: java.lang.Throwable -> L29
            r2 = 12
            r0.<init>(r2, r6)     // Catch: java.lang.Throwable -> L29
            L2.t r4 = (L2.t) r4     // Catch: java.lang.Throwable -> L29
            r4.e(r0)     // Catch: java.lang.Throwable -> L29
            java.lang.Object r4 = r6.q()     // Catch: java.lang.Throwable -> L29
            if (r4 != r1) goto L69
            return r1
        L69:
            r5.c()
            m2.v r4 = m2.C0880v.f8657a
            return r4
        L6f:
            r5.c()
            throw r4
        L73:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "awaitClose() can only be invoked from the producer context"
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: K1.f.m(L2.u, D.c0, q2.d):java.lang.Object");
    }

    public static final LinkedHashSet n(byte[] bArr) {
        ObjectInputStream objectInputStream;
        z2.h.f(bArr, "bytes");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (bArr.length == 0) {
            return linkedHashSet;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            try {
                objectInputStream = new ObjectInputStream(byteArrayInputStream);
            } finally {
            }
        } catch (IOException e3) {
            e3.printStackTrace();
        }
        try {
            int readInt = objectInputStream.readInt();
            for (int i2 = 0; i2 < readInt; i2++) {
                Uri parse = Uri.parse(objectInputStream.readUTF());
                boolean readBoolean = objectInputStream.readBoolean();
                z2.h.e(parse, "uri");
                linkedHashSet.add(new C0013c(readBoolean, parse));
            }
            AbstractC0949a.h(objectInputStream, null);
            AbstractC0949a.h(byteArrayInputStream, null);
            return linkedHashSet;
        } finally {
        }
    }

    public static final boolean o(b0.d dVar, float f3, float f4) {
        return f3 <= dVar.f7062c && dVar.f7060a <= f3 && f4 <= dVar.f7063d && dVar.f7061b <= f4;
    }

    public static final boolean p(b0.d dVar, float f3, float f4) {
        return f3 <= dVar.f7062c && dVar.f7060a <= f3 && f4 <= dVar.f7063d && dVar.f7061b <= f4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0023, code lost:
    
        if (r1 <= r6.getHeight()) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final c0.C0588g q(Z.c r20, float r21) {
        /*
            r0 = r20
            r3 = r21
            double r1 = (double) r3
            double r1 = java.lang.Math.ceil(r1)
            float r1 = (float) r1
            int r1 = (int) r1
            int r1 = r1 * 2
            c0.g r2 = a.AbstractC0423a.f6445a
            c0.s r4 = a.AbstractC0423a.f6446b
            e0.b r5 = a.AbstractC0423a.f6447c
            if (r2 == 0) goto L29
            if (r4 == 0) goto L29
            android.graphics.Bitmap r6 = r2.f7253a
            int r7 = r6.getWidth()
            if (r1 > r7) goto L29
            int r6 = r6.getHeight()
            if (r1 <= r6) goto L26
            goto L29
        L26:
            r8 = r2
            r9 = r4
            goto L37
        L29:
            r2 = 1
            c0.g r2 = c0.AbstractC0571K.f(r1, r1, r2)
            a.AbstractC0423a.f6445a = r2
            c0.c r4 = c0.AbstractC0571K.a(r2)
            a.AbstractC0423a.f6446b = r4
            goto L26
        L37:
            if (r5 != 0) goto L41
            e0.b r1 = new e0.b
            r1.<init>()
            a.AbstractC0423a.f6447c = r1
            goto L42
        L41:
            r1 = r5
        L42:
            Z.a r2 = r0.f6379h
            O0.k r2 = r2.getLayoutDirection()
            android.graphics.Bitmap r4 = r8.f7253a
            int r5 = r4.getWidth()
            float r5 = (float) r5
            int r4 = r4.getHeight()
            float r4 = (float) r4
            long r4 = B1.C.i(r5, r4)
            e0.a r7 = r1.f7551h
            O0.b r6 = r7.f7547a
            O0.k r15 = r7.f7548b
            c0.s r13 = r7.f7549c
            long r11 = r7.f7550d
            r7.f7547a = r0
            r7.f7548b = r2
            r7.f7549c = r9
            r7.f7550d = r4
            r9.f()
            long r4 = c0.C0603v.f7272b
            long r16 = r1.e()
            r0 = 58
            r10 = r1
            r18 = r11
            r11 = r4
            r4 = r13
            r13 = r16
            r5 = r15
            r15 = r0
            e0.InterfaceC0654d.W(r10, r11, r13, r15)
            r16 = 4278190080(0xff000000, double:2.113706745E-314)
            long r11 = c0.AbstractC0571K.d(r16)
            long r13 = B1.C.i(r3, r3)
            r15 = 120(0x78, float:1.68E-43)
            e0.InterfaceC0654d.W(r10, r11, r13, r15)
            long r10 = c0.AbstractC0571K.d(r16)
            long r12 = e(r3, r3)
            r14 = 120(0x78, float:1.68E-43)
            r15 = 0
            r0 = r1
            r1 = r10
            r3 = r21
            r11 = r4
            r10 = r5
            r4 = r12
            r12 = r6
            r6 = r15
            r13 = r7
            r7 = r14
            e0.InterfaceC0654d.u0(r0, r1, r3, r4, r6, r7)
            r9.b()
            r13.f7547a = r12
            r13.f7548b = r10
            r13.f7549c = r11
            r0 = r18
            r13.f7550d = r0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: K1.f.q(Z.c, float):c0.g");
    }

    public static Q1.m r() {
        C1.b bVar = new C1.b(26, false);
        Q1.m mVar = new Q1.m();
        mVar.f5302a = bVar;
        mVar.f5303b = Charset.forName("UTF-8");
        return mVar;
    }

    public static final boolean s(int i2, int i3) {
        return i2 == i3;
    }

    public static final boolean t(int i2, int i3) {
        return i2 == i3;
    }

    public static C.b u(C.b bVar, O0.k kVar, K k3, O0.b bVar2, H0.d dVar) {
        if (bVar != null && kVar == bVar.f325a && z2.h.a(k3, bVar.f326b) && bVar2.c() == bVar.f327c.c() && dVar == bVar.f328d) {
            return bVar;
        }
        C.b bVar3 = C.b.f324h;
        if (bVar3 != null && kVar == bVar3.f325a && z2.h.a(k3, bVar3.f326b) && bVar2.c() == bVar3.f327c.c() && dVar == bVar3.f328d) {
            return bVar3;
        }
        C.b bVar4 = new C.b(kVar, B2.a.C(k3, kVar), bVar2, dVar);
        C.b.f324h = bVar4;
        return bVar4;
    }

    public static final C0712e v() {
        C0712e c0712e = f4540c;
        if (c0712e != null) {
            return c0712e;
        }
        C0711d c0711d = new C0711d("Filled.Delete", false);
        int i2 = AbstractC0732y.f7958a;
        C0578S c0578s = new C0578S(C0603v.f7272b);
        J.V0 v0 = new J.V0(1);
        v0.h(6.0f, 19.0f);
        v0.c(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        v0.e(8.0f);
        v0.c(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        v0.k(7.0f);
        v0.d(6.0f);
        v0.l(12.0f);
        v0.a();
        v0.h(19.0f, 4.0f);
        v0.e(-3.5f);
        v0.g(-1.0f, -1.0f);
        v0.e(-5.0f);
        v0.g(-1.0f, 1.0f);
        v0.d(5.0f);
        v0.l(2.0f);
        v0.e(14.0f);
        v0.k(4.0f);
        v0.a();
        C0711d.a(c0711d, v0.f4104h, c0578s);
        C0712e b3 = c0711d.b();
        f4540c = b3;
        return b3;
    }

    public static final float w(Layout layout, int i2, Paint paint) {
        float abs;
        float width;
        float lineLeft = layout.getLineLeft(i2);
        D0.C c3 = D0.E.f960a;
        if (layout.getEllipsisCount(i2) <= 0 || layout.getParagraphDirection(i2) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        float measureText = paint.measureText("…") + (layout.getPrimaryHorizontal(layout.getEllipsisStart(i2) + layout.getLineStart(i2)) - lineLeft);
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i2);
        if (paragraphAlignment != null && F0.d.f1088a[paragraphAlignment.ordinal()] == 1) {
            abs = Math.abs(lineLeft);
            width = (layout.getWidth() - measureText) / 2.0f;
        } else {
            abs = Math.abs(lineLeft);
            width = layout.getWidth() - measureText;
        }
        return width + abs;
    }

    public static final float x(Layout layout, int i2, Paint paint) {
        float width;
        float width2;
        D0.C c3 = D0.E.f960a;
        if (layout.getEllipsisCount(i2) <= 0 || layout.getParagraphDirection(i2) != -1 || layout.getWidth() >= layout.getLineRight(i2)) {
            return 0.0f;
        }
        float measureText = paint.measureText("…") + (layout.getLineRight(i2) - layout.getPrimaryHorizontal(layout.getEllipsisStart(i2) + layout.getLineStart(i2)));
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i2);
        if (paragraphAlignment != null && F0.d.f1088a[paragraphAlignment.ordinal()] == 1) {
            width = layout.getWidth() - layout.getLineRight(i2);
            width2 = (layout.getWidth() - measureText) / 2.0f;
        } else {
            width = layout.getWidth() - layout.getLineRight(i2);
            width2 = layout.getWidth() - measureText;
        }
        return width - width2;
    }

    public static final C0712e y() {
        C0712e c0712e = f4541d;
        if (c0712e != null) {
            return c0712e;
        }
        C0711d c0711d = new C0711d("Filled.Person", false);
        int i2 = AbstractC0732y.f7958a;
        C0578S c0578s = new C0578S(C0603v.f7272b);
        J.V0 v0 = new J.V0(1);
        v0.h(12.0f, 12.0f);
        v0.c(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f);
        v0.j(-1.79f, -4.0f, -4.0f, -4.0f);
        v0.j(-4.0f, 1.79f, -4.0f, 4.0f);
        v0.j(1.79f, 4.0f, 4.0f, 4.0f);
        v0.a();
        v0.h(12.0f, 14.0f);
        v0.c(-2.67f, 0.0f, -8.0f, 1.34f, -8.0f, 4.0f);
        v0.l(2.0f);
        v0.e(16.0f);
        v0.l(-2.0f);
        v0.c(0.0f, -2.66f, -5.33f, -4.0f, -8.0f, -4.0f);
        v0.a();
        C0711d.a(c0711d, v0.f4104h, c0578s);
        C0712e b3 = c0711d.b();
        f4541d = b3;
        return b3;
    }

    public static final C0673a z(View view) {
        C0673a c0673a = (C0673a) view.getTag(R.id.pooling_container_listener_holder_tag);
        if (c0673a != null) {
            return c0673a;
        }
        C0673a c0673a2 = new C0673a();
        view.setTag(R.id.pooling_container_listener_holder_tag, c0673a2);
        return c0673a2;
    }

    public abstract void N(boolean z3);
}
