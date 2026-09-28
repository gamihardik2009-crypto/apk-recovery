package u0;

import android.graphics.Rect;
import android.graphics.Region;
import android.os.Binder;
import android.os.Build;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.View;
import b0.AbstractC0503a;
import c0.AbstractC0569I;
import c0.AbstractC0571K;
import c0.C0566F;
import c0.C0567G;
import c0.C0568H;
import c0.C0591j;
import c0.InterfaceC0570J;
import j.AbstractC0754j;
import j.C0761q;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import m2.InterfaceC0861c;
import r0.AbstractC1108W;
import r0.InterfaceC1129r;
import t0.AbstractC1248f;
import t0.C1236E;

/* loaded from: classes.dex */
public abstract class N implements U0 {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f10925b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static final Class[] f10926c = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    /* renamed from: d, reason: collision with root package name */
    public static final b0.d f10927d = new b0.d(0.0f, 0.0f, 10.0f, 10.0f);

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f10928e = 0;

    public static final void A(C1280d0 c1280d0, int i2) {
        Object obj;
        Iterator<T> it = c1280d0.getLayoutNodeToHolder().entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((C1236E) ((Map.Entry) obj).getKey()).f10388i == i2) {
                    break;
                }
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry != null) {
            B1.t.w(entry.getValue());
        }
    }

    public static final String B(Object obj) {
        return (obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName()) + '@' + String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
    }

    public static final String C(int i2) {
        if (A0.h.a(i2, 0)) {
            return "android.widget.Button";
        }
        if (A0.h.a(i2, 1)) {
            return "android.widget.CheckBox";
        }
        if (A0.h.a(i2, 3)) {
            return "android.widget.RadioButton";
        }
        if (A0.h.a(i2, 5)) {
            return "android.widget.ImageView";
        }
        if (A0.h.a(i2, 6)) {
            return "android.widget.Spinner";
        }
        return null;
    }

    public static void D(View view) {
        try {
            if (!X0.f10990z) {
                X0.f10990z = true;
                if (Build.VERSION.SDK_INT < 28) {
                    X0.f10988x = View.class.getDeclaredMethod("updateDisplayListIfDirty", null);
                    X0.f10989y = View.class.getDeclaredField("mRecreateDisplayList");
                } else {
                    X0.f10988x = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass()).invoke(View.class, "updateDisplayListIfDirty", new Class[0]);
                    X0.f10989y = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(View.class, "mRecreateDisplayList");
                }
                Method method = X0.f10988x;
                if (method != null) {
                    method.setAccessible(true);
                }
                Field field = X0.f10989y;
                if (field != null) {
                    field.setAccessible(true);
                }
            }
            Field field2 = X0.f10989y;
            if (field2 != null) {
                field2.setBoolean(view, true);
            }
            Method method2 = X0.f10988x;
            if (method2 != null) {
                method2.invoke(view, null);
            }
        } catch (Throwable unused) {
            X0.f10986A = true;
        }
    }

    public static final boolean l(A0.q qVar) {
        A0.k i2 = qVar.i();
        return !i2.f60h.containsKey(A0.t.f103i);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0042 A[LOOP:0: B:8:0x0024->B:18:0x0042, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0048 A[EDGE_INSN: B:19:0x0048->B:20:0x0048 BREAK  A[LOOP:0: B:8:0x0024->B:18:0x0042], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean m(A0.q r5) {
        /*
            A0.k r0 = r5.f72d
            A0.x r1 = A0.t.f117x
            java.util.LinkedHashMap r0 = r0.f60h
            boolean r0 = r0.containsKey(r1)
            r1 = 1
            if (r0 == 0) goto L1e
            A0.x r0 = A0.t.f105k
            A0.k r2 = r5.f72d
            java.lang.Object r0 = B1.C.T(r2, r0)
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            boolean r0 = z2.h.a(r0, r2)
            if (r0 != 0) goto L1e
            goto L66
        L1e:
            t0.E r5 = r5.f71c
            t0.E r5 = r5.s()
        L24:
            r0 = 0
            r2 = 0
            if (r5 == 0) goto L47
            A0.k r3 = r5.o()
            if (r3 == 0) goto L3e
            boolean r4 = r3.f61i
            if (r4 != r1) goto L3e
            A0.x r4 = A0.t.f117x
            java.util.LinkedHashMap r3 = r3.f60h
            boolean r3 = r3.containsKey(r4)
            if (r3 == 0) goto L3e
            r3 = r1
            goto L3f
        L3e:
            r3 = r2
        L3f:
            if (r3 == 0) goto L42
            goto L48
        L42:
            t0.E r5 = r5.s()
            goto L24
        L47:
            r5 = r0
        L48:
            if (r5 == 0) goto L65
            A0.k r5 = r5.o()
            if (r5 == 0) goto L66
            A0.x r3 = A0.t.f105k
            java.util.LinkedHashMap r5 = r5.f60h
            java.lang.Object r5 = r5.get(r3)
            if (r5 != 0) goto L5b
            goto L5c
        L5b:
            r0 = r5
        L5c:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            boolean r5 = z2.h.a(r0, r5)
            if (r5 != 0) goto L65
            goto L66
        L65:
            r1 = r2
        L66:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.N.m(A0.q):boolean");
    }

    public static final boolean n(A0.q qVar) {
        return qVar.f71c.f10403y == O0.k.f5149i;
    }

    public static final boolean o(Object obj) {
        if (obj instanceof T.p) {
            T.p pVar = (T.p) obj;
            if (pVar.c() != J.W.f4106j && pVar.c() != J.W.f4109m && pVar.c() != J.W.f4107k) {
                return false;
            }
            Object value = pVar.getValue();
            if (value == null) {
                return true;
            }
            return o(value);
        }
        if ((obj instanceof InterfaceC0861c) && (obj instanceof Serializable)) {
            return false;
        }
        Class[] clsArr = f10926c;
        for (int i2 = 0; i2 < 7; i2++) {
            if (clsArr[i2].isInstance(obj)) {
                return true;
            }
        }
        return false;
    }

    public static final float p(float[] fArr, int i2, float[] fArr2, int i3) {
        int i4 = i2 * 4;
        return (fArr[i4 + 3] * fArr2[12 + i3]) + (fArr[i4 + 2] * fArr2[8 + i3]) + (fArr[i4 + 1] * fArr2[4 + i3]) + (fArr[i4] * fArr2[i3]);
    }

    public static final C0761q q(A0.r rVar) {
        A0.q a3 = rVar.a();
        C0761q c0761q = AbstractC0754j.f8005a;
        C0761q c0761q2 = new C0761q();
        C1236E c1236e = a3.f71c;
        if (c1236e.E() && c1236e.D()) {
            b0.d e3 = a3.e();
            r(new Region(Math.round(e3.f7060a), Math.round(e3.f7061b), Math.round(e3.f7062c), Math.round(e3.f7063d)), a3, c0761q2, a3, new Region());
        }
        return c0761q2;
    }

    public static final void r(Region region, A0.q qVar, C0761q c0761q, A0.q qVar2, Region region2) {
        C1236E c1236e;
        Object u3;
        boolean E = qVar2.f71c.E();
        C1236E c1236e2 = qVar2.f71c;
        boolean z3 = (E && c1236e2.D()) ? false : true;
        boolean isEmpty = region.isEmpty();
        int i2 = qVar.f75g;
        int i3 = qVar2.f75g;
        if (!isEmpty || i3 == i2) {
            if (!z3 || qVar2.f73e) {
                A0.k kVar = qVar2.f72d;
                boolean z4 = kVar.f61i;
                Object obj = qVar2.f69a;
                if (z4 && (u3 = B2.a.u(c1236e2)) != null) {
                    obj = u3;
                }
                V.n nVar = ((V.n) obj).f5858h;
                Object obj2 = kVar.f60h.get(A0.j.f36b);
                if (obj2 == null) {
                    obj2 = null;
                }
                boolean z5 = obj2 != null;
                boolean z6 = nVar.f5858h.f5869t;
                b0.d dVar = b0.d.f7059e;
                if (z6) {
                    if (z5) {
                        t0.Z t3 = AbstractC1248f.t(nVar, 8);
                        if (t3.T0().f5869t) {
                            InterfaceC1129r g3 = AbstractC1108W.g(t3);
                            b0.b bVar = t3.f10539G;
                            if (bVar == null) {
                                bVar = new b0.b();
                                bVar.f7054a = 0.0f;
                                bVar.f7055b = 0.0f;
                                bVar.f7056c = 0.0f;
                                bVar.f7057d = 0.0f;
                                t3.f10539G = bVar;
                            }
                            long J02 = t3.J0(t3.S0());
                            bVar.f7054a = -b0.f.d(J02);
                            bVar.f7055b = -b0.f.b(J02);
                            bVar.f7056c = b0.f.d(J02) + t3.i0();
                            bVar.f7057d = b0.f.b(J02) + ((int) (t3.f9836j & 4294967295L));
                            while (true) {
                                if (t3 == g3) {
                                    dVar = new b0.d(bVar.f7054a, bVar.f7055b, bVar.f7056c, bVar.f7057d);
                                    break;
                                }
                                t3.i1(bVar, false, true);
                                if (bVar.b()) {
                                    break;
                                }
                                t3 = t3.f10549v;
                                z2.h.c(t3);
                            }
                        }
                    } else {
                        t0.Z t4 = AbstractC1248f.t(nVar, 8);
                        dVar = AbstractC1108W.g(t4).D(t4, true);
                    }
                }
                int round = Math.round(dVar.f7060a);
                int round2 = Math.round(dVar.f7061b);
                int round3 = Math.round(dVar.f7062c);
                int round4 = Math.round(dVar.f7063d);
                region2.set(round, round2, round3, round4);
                if (i3 == i2) {
                    i3 = -1;
                }
                if (!region2.op(region, Region.Op.INTERSECT)) {
                    if (qVar2.f73e) {
                        A0.q j3 = qVar2.j();
                        b0.d e3 = (j3 == null || (c1236e = j3.f71c) == null || !c1236e.E()) ? f10927d : j3.e();
                        c0761q.g(i3, new Q0(qVar2, new Rect(Math.round(e3.f7060a), Math.round(e3.f7061b), Math.round(e3.f7062c), Math.round(e3.f7063d))));
                        return;
                    } else {
                        if (i3 == -1) {
                            c0761q.g(i3, new Q0(qVar2, region2.getBounds()));
                            return;
                        }
                        return;
                    }
                }
                c0761q.g(i3, new Q0(qVar2, region2.getBounds()));
                List h2 = A0.q.h(qVar2, true, 4);
                for (int size = h2.size() - 1; -1 < size; size--) {
                    r(region, qVar, c0761q, (A0.q) h2.get(size), region2);
                }
                if (v(qVar2)) {
                    region.op(round, round2, round3, round4, Region.Op.DIFFERENCE);
                }
            }
        }
    }

    public static final C0.H s(A0.k kVar) {
        y2.c cVar;
        ArrayList arrayList = new ArrayList();
        A0.x xVar = A0.j.f35a;
        A0.a aVar = (A0.a) B1.C.T(kVar, A0.j.f35a);
        if (aVar == null || (cVar = (y2.c) aVar.f17b) == null || !((Boolean) cVar.l(arrayList)).booleanValue()) {
            return null;
        }
        return (C0.H) arrayList.get(0);
    }

    public static final boolean t(float[] fArr, float[] fArr2) {
        float f3 = fArr[0];
        float f4 = fArr[1];
        float f5 = fArr[2];
        float f6 = fArr[3];
        float f7 = fArr[4];
        float f8 = fArr[5];
        float f9 = fArr[6];
        float f10 = fArr[7];
        float f11 = fArr[8];
        float f12 = fArr[9];
        float f13 = fArr[10];
        float f14 = fArr[11];
        float f15 = fArr[12];
        float f16 = fArr[13];
        float f17 = fArr[14];
        float f18 = fArr[15];
        float f19 = (f3 * f8) - (f4 * f7);
        float f20 = (f3 * f9) - (f5 * f7);
        float f21 = (f3 * f10) - (f6 * f7);
        float f22 = (f4 * f9) - (f5 * f8);
        float f23 = (f4 * f10) - (f6 * f8);
        float f24 = (f5 * f10) - (f6 * f9);
        float f25 = (f11 * f16) - (f12 * f15);
        float f26 = (f11 * f17) - (f13 * f15);
        float f27 = (f11 * f18) - (f14 * f15);
        float f28 = (f12 * f17) - (f13 * f16);
        float f29 = (f12 * f18) - (f14 * f16);
        float f30 = (f13 * f18) - (f14 * f17);
        float f31 = (f24 * f25) + (((f22 * f27) + ((f21 * f28) + ((f19 * f30) - (f20 * f29)))) - (f23 * f26));
        if (f31 == 0.0f) {
            return false;
        }
        float f32 = 1.0f / f31;
        fArr2[0] = ((f10 * f28) + ((f8 * f30) - (f9 * f29))) * f32;
        fArr2[1] = (((f5 * f29) + ((-f4) * f30)) - (f6 * f28)) * f32;
        fArr2[2] = ((f18 * f22) + ((f16 * f24) - (f17 * f23))) * f32;
        fArr2[3] = (((f13 * f23) + ((-f12) * f24)) - (f14 * f22)) * f32;
        float f33 = -f7;
        fArr2[4] = (((f9 * f27) + (f33 * f30)) - (f10 * f26)) * f32;
        fArr2[5] = ((f6 * f26) + ((f30 * f3) - (f5 * f27))) * f32;
        float f34 = -f15;
        fArr2[6] = (((f17 * f21) + (f34 * f24)) - (f18 * f20)) * f32;
        fArr2[7] = ((f14 * f20) + ((f24 * f11) - (f13 * f21))) * f32;
        fArr2[8] = ((f10 * f25) + ((f7 * f29) - (f8 * f27))) * f32;
        fArr2[9] = (((f27 * f4) + ((-f3) * f29)) - (f6 * f25)) * f32;
        fArr2[10] = ((f18 * f19) + ((f15 * f23) - (f16 * f21))) * f32;
        fArr2[11] = (((f21 * f12) + ((-f11) * f23)) - (f14 * f19)) * f32;
        fArr2[12] = (((f8 * f26) + (f33 * f28)) - (f9 * f25)) * f32;
        fArr2[13] = ((f5 * f25) + ((f3 * f28) - (f4 * f26))) * f32;
        fArr2[14] = (((f16 * f20) + (f34 * f22)) - (f17 * f19)) * f32;
        fArr2[15] = ((f13 * f19) + ((f11 * f22) - (f12 * f20))) * f32;
        return true;
    }

    public static final boolean u(C1236E c1236e, C1236E c1236e2) {
        C1236E s3 = c1236e2.s();
        if (s3 == null) {
            return false;
        }
        return z2.h.a(s3, c1236e) || u(c1236e, s3);
    }

    public static final boolean v(A0.q qVar) {
        A0.k kVar = qVar.f72d;
        if (!kVar.f61i) {
            Set keySet = kVar.f60h.keySet();
            if (!(keySet instanceof Collection) || !keySet.isEmpty()) {
                Iterator it = keySet.iterator();
                while (it.hasNext()) {
                    if (((A0.x) it.next()).f126c) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public static final boolean w(AbstractC0569I abstractC0569I, float f3, float f4, InterfaceC0570J interfaceC0570J, InterfaceC0570J interfaceC0570J2) {
        boolean y3;
        if (!(abstractC0569I instanceof C0567G)) {
            if (!(abstractC0569I instanceof C0568H)) {
                if (abstractC0569I instanceof C0566F) {
                    return x(((C0566F) abstractC0569I).f7189a, f3, f4, interfaceC0570J, interfaceC0570J2);
                }
                throw new J2.r();
            }
            b0.e eVar = ((C0568H) abstractC0569I).f7191a;
            if (f3 < eVar.f7064a) {
                return false;
            }
            float f5 = eVar.f7066c;
            if (f3 >= f5) {
                return false;
            }
            float f6 = eVar.f7065b;
            if (f4 < f6) {
                return false;
            }
            float f7 = eVar.f7067d;
            if (f4 >= f7) {
                return false;
            }
            long j3 = eVar.f7068e;
            float b3 = AbstractC0503a.b(j3);
            long j4 = eVar.f7069f;
            if (AbstractC0503a.b(j4) + b3 <= eVar.b()) {
                long j5 = eVar.f7071h;
                float b4 = AbstractC0503a.b(j5);
                long j6 = eVar.f7070g;
                if (AbstractC0503a.b(j6) + b4 <= eVar.b()) {
                    if (AbstractC0503a.c(j5) + AbstractC0503a.c(j3) <= eVar.a()) {
                        if (AbstractC0503a.c(j6) + AbstractC0503a.c(j4) <= eVar.a()) {
                            float b5 = AbstractC0503a.b(j3);
                            float f8 = eVar.f7064a;
                            float f9 = b5 + f8;
                            float c3 = AbstractC0503a.c(j3) + f6;
                            float b6 = f5 - AbstractC0503a.b(j4);
                            float c4 = AbstractC0503a.c(j4) + f6;
                            float b7 = f5 - AbstractC0503a.b(j6);
                            float c5 = f7 - AbstractC0503a.c(j6);
                            float c6 = f7 - AbstractC0503a.c(j5);
                            float b8 = f8 + AbstractC0503a.b(j5);
                            if (f3 < f9 && f4 < c3) {
                                y3 = y(f3, f4, eVar.f7068e, f9, c3);
                            } else if (f3 < b8 && f4 > c6) {
                                y3 = y(f3, f4, eVar.f7071h, b8, c6);
                            } else if (f3 > b6 && f4 < c4) {
                                y3 = y(f3, f4, eVar.f7069f, b6, c4);
                            } else if (f3 > b7 && f4 > c5) {
                                y3 = y(f3, f4, eVar.f7070g, b7, c5);
                            }
                            return y3;
                        }
                    }
                }
            }
            InterfaceC0570J h2 = interfaceC0570J2 == null ? AbstractC0571K.h() : interfaceC0570J2;
            InterfaceC0570J.b(h2, eVar);
            return x(h2, f3, f4, interfaceC0570J, interfaceC0570J2);
        }
        b0.d dVar = ((C0567G) abstractC0569I).f7190a;
        if (dVar.f7060a > f3 || f3 >= dVar.f7062c || dVar.f7061b > f4 || f4 >= dVar.f7063d) {
            return false;
        }
        return true;
    }

    public static final boolean x(InterfaceC0570J interfaceC0570J, float f3, float f4, InterfaceC0570J interfaceC0570J2, InterfaceC0570J interfaceC0570J3) {
        b0.d dVar = new b0.d(f3 - 0.005f, f4 - 0.005f, f3 + 0.005f, f4 + 0.005f);
        if (interfaceC0570J2 == null) {
            interfaceC0570J2 = AbstractC0571K.h();
        }
        InterfaceC0570J.a(interfaceC0570J2, dVar);
        if (interfaceC0570J3 == null) {
            interfaceC0570J3 = AbstractC0571K.h();
        }
        C0591j c0591j = (C0591j) interfaceC0570J3;
        c0591j.d(interfaceC0570J, interfaceC0570J2, 1);
        boolean isEmpty = c0591j.f7260a.isEmpty();
        c0591j.e();
        ((C0591j) interfaceC0570J2).e();
        return !isEmpty;
    }

    public static final boolean y(float f3, float f4, long j3, float f5, float f6) {
        float f7 = f3 - f5;
        float f8 = f4 - f6;
        float b3 = AbstractC0503a.b(j3);
        float c3 = AbstractC0503a.c(j3);
        return ((f8 * f8) / (c3 * c3)) + ((f7 * f7) / (b3 * b3)) <= 1.0f;
    }

    public static final void z(float[] fArr, float[] fArr2) {
        float p3 = p(fArr2, 0, fArr, 0);
        float p4 = p(fArr2, 0, fArr, 1);
        float p5 = p(fArr2, 0, fArr, 2);
        float p6 = p(fArr2, 0, fArr, 3);
        float p7 = p(fArr2, 1, fArr, 0);
        float p8 = p(fArr2, 1, fArr, 1);
        float p9 = p(fArr2, 1, fArr, 2);
        float p10 = p(fArr2, 1, fArr, 3);
        float p11 = p(fArr2, 2, fArr, 0);
        float p12 = p(fArr2, 2, fArr, 1);
        float p13 = p(fArr2, 2, fArr, 2);
        float p14 = p(fArr2, 2, fArr, 3);
        float p15 = p(fArr2, 3, fArr, 0);
        float p16 = p(fArr2, 3, fArr, 1);
        float p17 = p(fArr2, 3, fArr, 2);
        float p18 = p(fArr2, 3, fArr, 3);
        fArr[0] = p3;
        fArr[1] = p4;
        fArr[2] = p5;
        fArr[3] = p6;
        fArr[4] = p7;
        fArr[5] = p8;
        fArr[6] = p9;
        fArr[7] = p10;
        fArr[8] = p11;
        fArr[9] = p12;
        fArr[10] = p13;
        fArr[11] = p14;
        fArr[12] = p15;
        fArr[13] = p16;
        fArr[14] = p17;
        fArr[15] = p18;
    }
}
