package B;

import B1.RunnableC0015e;
import D.X;
import H.C1;
import J.C0257c;
import J.C0274k0;
import J.V0;
import J.W;
import J.W0;
import a0.C0438o;
import android.R;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.Z;
import androidx.lifecycle.b0;
import androidx.profileinstaller.ProfileInstallReceiver;
import b1.C0522T;
import b1.C0523U;
import b1.C0532i;
import c0.InterfaceC0600s;
import g1.C0687i;
import g1.InterfaceC0686h;
import g1.ThreadFactoryC0679a;
import j.AbstractC0739E;
import j.AbstractC0754j;
import j.AbstractC0758n;
import j.C0736B;
import j.C0757m;
import j.C0761q;
import j.C0769y;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k.AbstractC0779a;
import l.AbstractC0793b;
import l.U;
import m.AbstractC0845s;
import m.AbstractC0852z;
import m.B0;
import m.C0820D;
import m.C0822F;
import m.InterfaceC0818B;
import m.InterfaceC0819C;
import m.InterfaceC0846t;
import q1.InterfaceC1061c;
import s.AbstractC1166e;
import s1.AbstractC1195a;
import u0.C1314v;
import z.EnumC1407G;
import z.S;

/* loaded from: classes.dex */
public class F implements I0.s, InterfaceC0686h, InterfaceC0819C, InterfaceC0846t, B0, InterfaceC1061c {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f164h;

    /* renamed from: i, reason: collision with root package name */
    public Object f165i;

    public /* synthetic */ F(int i2, Object obj) {
        this.f164h = i2;
        this.f165i = obj;
    }

    public boolean A(long j3, C0.E e3) {
        S s3;
        X x2 = (X) this.f165i;
        if (!x2.j() || x2.l().f3932a.f500a.length() == 0 || (s3 = x2.f783d) == null || s3.d() == null) {
            return false;
        }
        C0438o c0438o = x2.f789j;
        if (c0438o != null) {
            c0438o.b();
        }
        x2.f792m = j3;
        x2.f796r = -1;
        x2.h(true);
        I(x2.l(), x2.f792m, true, e3);
        return true;
    }

    public z B(K1.c cVar, n0.v vVar) {
        Object obj;
        boolean z3;
        long j3;
        long j4;
        int i2;
        List list = (List) cVar.f4532a;
        C0757m c0757m = new C0757m(list.size());
        int size = list.size();
        int i3 = 0;
        while (i3 < size) {
            n0.t tVar = (n0.t) list.get(i3);
            long j5 = tVar.f8973a;
            C0757m c0757m2 = (C0757m) this.f165i;
            int b3 = AbstractC0779a.b(c0757m2.f8009i, c0757m2.f8011k, j5);
            Object obj2 = AbstractC0758n.f8012a;
            if (b3 < 0 || (obj = c0757m2.f8010j[b3]) == obj2) {
                obj = null;
            }
            n0.s sVar = (n0.s) obj;
            if (sVar == null) {
                j3 = tVar.f8974b;
                j4 = tVar.f8976d;
                z3 = false;
            } else {
                long F = ((C1314v) vVar).F(sVar.f8971b);
                long j6 = sVar.f8970a;
                z3 = sVar.f8972c;
                j3 = j6;
                j4 = F;
            }
            long j7 = tVar.f8982j;
            long j8 = tVar.f8983k;
            long j9 = tVar.f8973a;
            c0757m.b(j9, new n0.r(j9, tVar.f8974b, tVar.f8976d, tVar.f8977e, tVar.f8978f, j3, j4, z3, tVar.f8979g, tVar.f8981i, j7, j8));
            long j10 = tVar.f8973a;
            boolean z4 = tVar.f8977e;
            if (z4) {
                i2 = i3;
                c0757m2.b(j10, new n0.s(tVar.f8974b, tVar.f8975c, z4));
            } else {
                i2 = i3;
                int b4 = AbstractC0779a.b(c0757m2.f8009i, c0757m2.f8011k, j10);
                if (b4 >= 0) {
                    Object[] objArr = c0757m2.f8010j;
                    if (objArr[b4] != obj2) {
                        objArr[b4] = obj2;
                        c0757m2.f8008h = true;
                    }
                }
            }
            i3 = i2 + 1;
        }
        z zVar = new z();
        zVar.f239c = c0757m;
        zVar.f240d = cVar;
        return zVar;
    }

    public void C(HashMap hashMap) {
        for (Map.Entry entry : hashMap.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            HashMap hashMap2 = (HashMap) this.f165i;
            if (value == null) {
                hashMap2.put(str, null);
            } else {
                Class<?> cls = value.getClass();
                if (cls == Boolean.class || cls == Byte.class || cls == Integer.class || cls == Long.class || cls == Float.class || cls == Double.class || cls == String.class || cls == Boolean[].class || cls == Byte[].class || cls == Integer[].class || cls == Long[].class || cls == Float[].class || cls == Double[].class || cls == String[].class) {
                    hashMap2.put(str, value);
                } else {
                    int i2 = 0;
                    if (cls == boolean[].class) {
                        boolean[] zArr = (boolean[]) value;
                        String str2 = B1.h.f291b;
                        Boolean[] boolArr = new Boolean[zArr.length];
                        while (i2 < zArr.length) {
                            boolArr[i2] = Boolean.valueOf(zArr[i2]);
                            i2++;
                        }
                        hashMap2.put(str, boolArr);
                    } else if (cls == byte[].class) {
                        byte[] bArr = (byte[]) value;
                        String str3 = B1.h.f291b;
                        Byte[] bArr2 = new Byte[bArr.length];
                        while (i2 < bArr.length) {
                            bArr2[i2] = Byte.valueOf(bArr[i2]);
                            i2++;
                        }
                        hashMap2.put(str, bArr2);
                    } else if (cls == int[].class) {
                        int[] iArr = (int[]) value;
                        String str4 = B1.h.f291b;
                        Integer[] numArr = new Integer[iArr.length];
                        while (i2 < iArr.length) {
                            numArr[i2] = Integer.valueOf(iArr[i2]);
                            i2++;
                        }
                        hashMap2.put(str, numArr);
                    } else if (cls == long[].class) {
                        long[] jArr = (long[]) value;
                        String str5 = B1.h.f291b;
                        Long[] lArr = new Long[jArr.length];
                        while (i2 < jArr.length) {
                            lArr[i2] = Long.valueOf(jArr[i2]);
                            i2++;
                        }
                        hashMap2.put(str, lArr);
                    } else if (cls == float[].class) {
                        float[] fArr = (float[]) value;
                        String str6 = B1.h.f291b;
                        Float[] fArr2 = new Float[fArr.length];
                        while (i2 < fArr.length) {
                            fArr2[i2] = Float.valueOf(fArr[i2]);
                            i2++;
                        }
                        hashMap2.put(str, fArr2);
                    } else {
                        if (cls != double[].class) {
                            throw new IllegalArgumentException("Key " + str + " has invalid type " + cls);
                        }
                        double[] dArr = (double[]) value;
                        String str7 = B1.h.f291b;
                        Double[] dArr2 = new Double[dArr.length];
                        while (i2 < dArr.length) {
                            dArr2[i2] = Double.valueOf(dArr[i2]);
                            i2++;
                        }
                        hashMap2.put(str, dArr2);
                    }
                }
            }
        }
    }

    public boolean D(Object obj, Object obj2) {
        C0769y c0769y = (C0769y) this.f165i;
        Object e3 = c0769y.e(obj);
        if (e3 == null) {
            return false;
        }
        if (!(e3 instanceof C0736B)) {
            if (!z2.h.a(e3, obj2)) {
                return false;
            }
            c0769y.g(obj);
            return true;
        }
        C0736B c0736b = (C0736B) e3;
        boolean j3 = c0736b.j(obj2);
        if (j3 && c0736b.g()) {
            c0769y.g(obj);
        }
        return j3;
    }

    public void E(Object obj) {
        C0769y c0769y = (C0769y) this.f165i;
        long[] jArr = c0769y.f8065a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j3 = jArr[i2];
            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i2 - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 & j3) < 128) {
                        int i5 = (i2 << 3) + i4;
                        Object obj2 = c0769y.f8066b[i5];
                        Object obj3 = c0769y.f8067c[i5];
                        if (obj3 instanceof C0736B) {
                            z2.h.d(obj3, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.removeScope$lambda$3>");
                            C0736B c0736b = (C0736B) obj3;
                            c0736b.j(obj);
                            if (!c0736b.g()) {
                            }
                            c0769y.h(i5);
                        } else {
                            if (obj3 != obj) {
                            }
                            c0769y.h(i5);
                        }
                    }
                    j3 >>= 8;
                }
                if (i3 != 8) {
                    return;
                }
            }
            if (i2 == length) {
                return;
            } else {
                i2++;
            }
        }
    }

    public void F(float f3, float f4, long j3) {
        InterfaceC0600s e3 = ((K1.m) this.f165i).e();
        e3.q(b0.c.d(j3), b0.c.e(j3));
        e3.e(f3, f4);
        e3.q(-b0.c.d(j3), -b0.c.e(j3));
    }

    public void G() {
        View view;
        View view2 = (View) this.f165i;
        if (view2 == null) {
            return;
        }
        if (view2.isInEditMode() || view2.onCheckIsTextEditor()) {
            view2.requestFocus();
            view = view2;
        } else {
            view = view2.getRootView().findFocus();
        }
        if (view == null) {
            view = view2.getRootView().findViewById(R.id.content);
        }
        if (view == null || !view.hasWindowFocus()) {
            return;
        }
        view.post(new RunnableC0015e(10, view));
    }

    public void H(float f3, float f4) {
        ((K1.m) this.f165i).e().q(f3, f4);
    }

    public void I(I0.z zVar, long j3, boolean z3, C0.E e3) {
        ((X) this.f165i).r(C0.J.b(X.c((X) this.f165i, zVar, j3, z3, false, e3, false)) ? EnumC1407G.f11513j : EnumC1407G.f11512i);
    }

    @Override // m.B0, m.z0
    public boolean a() {
        ((K1.i) this.f165i).getClass();
        return false;
    }

    @Override // m.z0
    public long b(AbstractC0845s abstractC0845s, AbstractC0845s abstractC0845s2, AbstractC0845s abstractC0845s3) {
        return ((K1.i) this.f165i).b(abstractC0845s, abstractC0845s2, abstractC0845s3);
    }

    @Override // g1.InterfaceC0686h
    public void c(l0.c cVar) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0679a("EmojiCompatInitializer"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new C1.g(this, cVar, threadPoolExecutor, 1));
    }

    @Override // m.InterfaceC0819C
    public float d(float f3, float f4) {
        double b3 = ((l.I) this.f165i).b(f4);
        double d3 = l.J.f8139a;
        return (Math.signum(f4) * ((float) (Math.exp((d3 / (d3 - 1.0d)) * b3) * r0.f8137h * r0.f8138i))) + f3;
    }

    @Override // m.z0
    public AbstractC0845s e(long j3, AbstractC0845s abstractC0845s, AbstractC0845s abstractC0845s2, AbstractC0845s abstractC0845s3) {
        return ((K1.i) this.f165i).e(j3, abstractC0845s, abstractC0845s2, abstractC0845s3);
    }

    @Override // q1.InterfaceC1061c
    public void f() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // m.z0
    public AbstractC0845s g(long j3, AbstractC0845s abstractC0845s, AbstractC0845s abstractC0845s2, AbstractC0845s abstractC0845s3) {
        return ((K1.i) this.f165i).g(j3, abstractC0845s, abstractC0845s2, abstractC0845s3);
    }

    @Override // m.InterfaceC0846t
    public InterfaceC0818B get(int i2) {
        switch (this.f164h) {
            case 24:
                return (C0820D) this.f165i;
            default:
                return (InterfaceC0818B) this.f165i;
        }
    }

    @Override // q1.InterfaceC1061c
    public void h(int i2, Object obj) {
        String str;
        switch (i2) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case AbstractC1166e.f10138f /* 5 */:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case AbstractC1166e.f10136d /* 6 */:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case AbstractC1166e.f10135c /* 9 */:
            default:
                str = "";
                break;
            case AbstractC1166e.f10137e /* 10 */:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i2 == 6 || i2 == 7 || i2 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.f165i).setResultCode(i2);
    }

    @Override // I0.s
    public int i(int i2) {
        C1 c12 = (C1) this.f165i;
        if (i2 <= c12.f1366b - 1) {
            return i2;
        }
        if (i2 <= c12.f1367c - 1) {
            return i2 - 1;
        }
        int i3 = c12.f1368d;
        return i2 <= i3 + 1 ? i2 - 2 : i3;
    }

    @Override // m.z0
    public AbstractC0845s k(AbstractC0845s abstractC0845s, AbstractC0845s abstractC0845s2, AbstractC0845s abstractC0845s3) {
        return ((K1.i) this.f165i).k(abstractC0845s, abstractC0845s2, abstractC0845s3);
    }

    @Override // I0.s
    public int l(int i2) {
        C1 c12 = (C1) this.f165i;
        if (i2 < c12.f1366b) {
            return i2;
        }
        if (i2 < c12.f1367c) {
            return i2 + 1;
        }
        int i3 = c12.f1368d;
        return i2 <= i3 ? i2 + 2 : i3 + 2;
    }

    @Override // m.InterfaceC0819C
    public float m(float f3, long j3) {
        long j4 = j3 / 1000000;
        l.H a3 = ((l.I) this.f165i).a(f3);
        long j5 = a3.f8136c;
        return (((Math.signum(a3.f8134a) * AbstractC0793b.a(j5 > 0 ? j4 / j5 : 1.0f).f8174b) * a3.f8135b) / j5) * 1000.0f;
    }

    @Override // m.InterfaceC0819C
    public float n(float f3, float f4, long j3) {
        long j4 = j3 / 1000000;
        l.H a3 = ((l.I) this.f165i).a(f4);
        long j5 = a3.f8136c;
        return (Math.signum(a3.f8134a) * a3.f8135b * AbstractC0793b.a(j5 > 0 ? j4 / j5 : 1.0f).f8173a) + f3;
    }

    @Override // m.InterfaceC0819C
    public long p(float f3) {
        return ((long) (Math.exp(((l.I) this.f165i).b(f3) / (l.J.f8139a - 1.0d)) * 1000.0d)) * 1000000;
    }

    @Override // m.InterfaceC0819C
    public float q() {
        return 0.0f;
    }

    public void r(Object obj, Object obj2) {
        C0769y c0769y = (C0769y) this.f165i;
        int d3 = c0769y.d(obj);
        boolean z3 = d3 < 0;
        Object obj3 = z3 ? null : c0769y.f8067c[d3];
        if (obj3 != null) {
            if (obj3 instanceof C0736B) {
                ((C0736B) obj3).a(obj2);
            } else if (obj3 != obj2) {
                C0736B c0736b = new C0736B();
                c0736b.a(obj3);
                c0736b.a(obj2);
                obj2 = c0736b;
            }
            obj2 = obj3;
        }
        if (!z3) {
            c0769y.f8067c[d3] = obj2;
            return;
        }
        int i2 = ~d3;
        c0769y.f8066b[i2] = obj;
        c0769y.f8067c[i2] = obj2;
    }

    public void s(AbstractC1195a... abstractC1195aArr) {
        z2.h.f(abstractC1195aArr, "migrations");
        for (AbstractC1195a abstractC1195a : abstractC1195aArr) {
            int i2 = abstractC1195a.f10201a;
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.f165i;
            Integer valueOf = Integer.valueOf(i2);
            Object obj = linkedHashMap.get(valueOf);
            if (obj == null) {
                obj = new TreeMap();
                linkedHashMap.put(valueOf, obj);
            }
            TreeMap treeMap = (TreeMap) obj;
            int i3 = abstractC1195a.f10202b;
            if (treeMap.containsKey(Integer.valueOf(i3))) {
                Log.w("ROOM", "Overriding migration " + treeMap.get(Integer.valueOf(i3)) + " with " + abstractC1195a);
            }
            treeMap.put(Integer.valueOf(i3), abstractC1195a);
        }
    }

    public void t(Float f3, int i2) {
        C0822F c0822f = new C0822F(f3, AbstractC0852z.f8613c);
        c0822f.f8304c = 0;
        ((C0761q) this.f165i).g(i2, c0822f);
    }

    public androidx.lifecycle.X u(z2.d dVar) {
        String str;
        Class cls = dVar.f11898a;
        z2.h.f(cls, "jClass");
        String str2 = null;
        if (!cls.isAnonymousClass() && !cls.isLocalClass()) {
            boolean isArray = cls.isArray();
            HashMap hashMap = z2.d.f11896c;
            if (isArray) {
                Class<?> componentType = cls.getComponentType();
                if (componentType.isPrimitive() && (str = (String) hashMap.get(componentType.getName())) != null) {
                    str2 = str.concat("Array");
                }
                if (str2 == null) {
                    str2 = "kotlin.Array";
                }
            } else {
                str2 = (String) hashMap.get(cls.getName());
                if (str2 == null) {
                    str2 = cls.getCanonicalName();
                }
            }
        }
        if (str2 != null) {
            return ((K1.m) this.f165i).k(dVar, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(str2));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }

    public W0 v() {
        C0687i a3 = C0687i.a();
        if (a3.b() == 1) {
            return new K0.k(true);
        }
        C0274k0 N3 = C0257c.N(Boolean.FALSE, W.f4109m);
        K0.g gVar = new K0.g(N3, this);
        a3.f7720a.writeLock().lock();
        try {
            if (a3.f7722c != 1 && a3.f7722c != 2) {
                a3.f7721b.add(gVar);
                a3.f7720a.writeLock().unlock();
                return N3;
            }
            a3.f7723d.post(new J1.e(Arrays.asList(gVar), a3.f7722c, null));
            a3.f7720a.writeLock().unlock();
            return N3;
        } catch (Throwable th) {
            a3.f7720a.writeLock().unlock();
            throw th;
        }
    }

    public void w() {
        View view = (View) this.f165i;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public void x(float f3, float f4, float f5, float f6) {
        K1.m mVar = (K1.m) this.f165i;
        InterfaceC0600s e3 = mVar.e();
        long i2 = B1.C.i(b0.f.d(mVar.j()) - (f5 + f3), b0.f.b(mVar.j()) - (f6 + f4));
        if (b0.f.d(i2) < 0.0f || b0.f.b(i2) < 0.0f) {
            throw new IllegalArgumentException("Width and height must be greater than or equal to zero");
        }
        mVar.r(i2);
        e3.q(f3, f4);
    }

    public boolean y(long j3, C0.E e3) {
        S s3;
        X x2 = (X) this.f165i;
        if (!x2.j() || x2.l().f3932a.f500a.length() == 0 || (s3 = x2.f783d) == null || s3.d() == null) {
            return false;
        }
        I(x2.l(), j3, false, e3);
        return true;
    }

    public void z() {
    }

    public F(O0.b bVar) {
        this.f164h = 22;
        this.f165i = new l.I(U.f8166a, bVar);
    }

    public F(View view) {
        this.f164h = 16;
        if (Build.VERSION.SDK_INT >= 30) {
            C0532i c0532i = new C0532i(15, view);
            c0532i.f7124j = view;
            this.f165i = c0532i;
            return;
        }
        this.f165i = new F(15, view);
    }

    public F(b0 b0Var, Z z3, G.s sVar) {
        this.f164h = 13;
        z2.h.f(b0Var, "store");
        z2.h.f(z3, "factory");
        z2.h.f(sVar, "defaultCreationExtras");
        this.f165i = new K1.m(b0Var, z3, sVar);
    }

    public F(Window window, View view) {
        this.f164h = 17;
        if (Build.VERSION.SDK_INT >= 30) {
            new C0532i(15, view).f7124j = view;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            this.f165i = new C0523U(window);
        } else {
            this.f165i = new C0522T(window);
        }
    }

    public F(Context context) {
        this.f164h = 19;
        this.f165i = context.getApplicationContext();
    }

    public F(int i2) {
        C1.b bVar;
        boolean z3 = false;
        this.f164h = i2;
        switch (i2) {
            case 2:
                this.f165i = C1.y.m(Looper.getMainLooper());
                break;
            case AbstractC1166e.f10138f /* 5 */:
                if (Build.VERSION.SDK_INT >= 28) {
                    bVar = new C1.b(4, z3);
                } else {
                    bVar = new C1.b(5, z3);
                }
                this.f165i = bVar;
                break;
            case 8:
                break;
            case AbstractC1166e.f10135c /* 9 */:
                this.f165i = new SparseArray(10);
                break;
            case AbstractC1166e.f10137e /* 10 */:
                long[] jArr = AbstractC0739E.f7971a;
                this.f165i = new C0769y();
                break;
            case 14:
                this.f165i = new CopyOnWriteArrayList();
                new HashMap();
                break;
            case 23:
                C0761q c0761q = AbstractC0754j.f8005a;
                this.f165i = new C0761q();
                break;
            case 27:
                this.f165i = new C0757m(10);
                break;
            case 29:
                this.f165i = new LinkedHashMap();
                break;
            default:
                this.f165i = new HashMap();
                break;
        }
    }

    public F(float f3, float f4, AbstractC0845s abstractC0845s) {
        InterfaceC0846t f5;
        this.f164h = 26;
        if (abstractC0845s != null) {
            f5 = new V0(f3, f4, abstractC0845s);
        } else {
            f5 = new F(f3, f4);
        }
        this.f165i = new K1.i(f5);
    }

    public F(float f3, float f4) {
        this.f164h = 24;
        this.f165i = new C0820D(f3, f4, 0.01f);
    }
}
