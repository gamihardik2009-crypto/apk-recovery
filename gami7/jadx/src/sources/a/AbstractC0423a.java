package a;

import A0.n;
import B.F;
import B1.C;
import B1.t;
import C0.C0018a;
import C0.J;
import C0.q;
import C1.y;
import D.C0038g;
import D.C0053w;
import D.InterfaceC0045n;
import D.V;
import D.X;
import D.Y;
import E0.e;
import G2.h;
import H.A1;
import H.AbstractC0107g0;
import H.AbstractC0124i3;
import H.AbstractC0162o;
import H.AbstractC0223x4;
import H.B1;
import H.C0093e0;
import H.C0114h0;
import H.C0226y1;
import H.D1;
import H.E0;
import H.I0;
import H.Z3;
import I0.z;
import J.C0257c;
import J.C0275l;
import J.C0285q;
import J.C0291t0;
import J.C0302z;
import J.InterfaceC0258c0;
import J.V0;
import J.W;
import J.X0;
import J2.B;
import J2.C0319p;
import J2.InterfaceC0328z;
import O2.s;
import P1.i;
import P1.l;
import R1.b;
import T0.j;
import T0.k;
import W1.A;
import W1.C0380a;
import W1.C0381b;
import W1.C0382c;
import W1.C0383d;
import W1.C0386g;
import W1.C0387h;
import W1.C0389j;
import W1.C0390k;
import W1.C0391l;
import W1.C0392m;
import W1.C0394o;
import W1.E;
import W1.P;
import W1.U;
import Y1.H;
import Y1.o;
import a.AbstractC0423a;
import android.content.Context;
import android.graphics.Path;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.view.inputmethod.ExtractedText;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.InterfaceC0461j;
import androidx.lifecycle.Q;
import androidx.lifecycle.Z;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import b0.AbstractC0503a;
import b0.d;
import c0.C0578S;
import c0.C0588g;
import c0.C0591j;
import c0.C0603v;
import c0.InterfaceC0570J;
import c0.InterfaceC0600s;
import com.example.bulksmsscheduler.SmsApplication;
import e0.C0652b;
import i0.AbstractC0727t;
import i0.AbstractC0732y;
import i0.C0711d;
import i0.C0712e;
import i0.C0715h;
import i0.C0716i;
import i0.C0717j;
import i0.C0718k;
import i0.C0719l;
import i0.C0720m;
import i0.C0721n;
import i0.C0722o;
import i0.C0723p;
import i0.C0724q;
import i0.C0725r;
import i0.C0726s;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjuster;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import k1.C0783a;
import l1.AbstractC0815b;
import m1.C0856b;
import m2.C0880v;
import n0.w;
import n2.AbstractC0948C;
import n2.AbstractC0959k;
import n2.AbstractC0961m;
import n2.AbstractC0963o;
import r0.InterfaceC1129r;
import r2.EnumC1145a;
import y.C1396d;
import y2.c;
import y2.f;
import z.S;
import z.a0;
import z2.v;

/* renamed from: a.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0423a implements e {

    /* renamed from: a, reason: collision with root package name */
    public static C0588g f6445a;

    /* renamed from: b, reason: collision with root package name */
    public static InterfaceC0600s f6446b;

    /* renamed from: c, reason: collision with root package name */
    public static C0652b f6447c;

    /* renamed from: d, reason: collision with root package name */
    public static C0712e f6448d;

    /* renamed from: e, reason: collision with root package name */
    public static C0712e f6449e;

    /* renamed from: f, reason: collision with root package name */
    public static C0712e f6450f;

    public static int D(Context context, String str) {
        if (str != null) {
            return (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) ? context.checkPermission(str, Process.myPid(), Process.myUid()) : j.a(new k(context).f5770a) ? 0 : -1;
        }
        throw new NullPointerException("permission must be non-null");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static g1.r E(android.content.Context r8) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lf
            g1.c r0 = new g1.c
            r1 = 20
            r2 = 0
            r0.<init>(r1, r2)
            goto L17
        Lf:
            C1.b r0 = new C1.b
            r1 = 20
            r2 = 0
            r0.<init>(r1, r2)
        L17:
            android.content.pm.PackageManager r1 = r8.getPackageManager()
            java.lang.String r2 = "Package manager required to locate emoji font provider"
            l0.c.r(r1, r2)
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r3 = "androidx.content.action.LOAD_EMOJI_FONT"
            r2.<init>(r3)
            r3 = 0
            java.util.List r2 = r1.queryIntentContentProviders(r2, r3)
            java.util.Iterator r2 = r2.iterator()
        L30:
            boolean r4 = r2.hasNext()
            r5 = 0
            if (r4 == 0) goto L4c
            java.lang.Object r4 = r2.next()
            android.content.pm.ResolveInfo r4 = (android.content.pm.ResolveInfo) r4
            android.content.pm.ProviderInfo r4 = r4.providerInfo
            if (r4 == 0) goto L30
            android.content.pm.ApplicationInfo r6 = r4.applicationInfo
            if (r6 == 0) goto L30
            int r6 = r6.flags
            r7 = 1
            r6 = r6 & r7
            if (r6 != r7) goto L30
            goto L4d
        L4c:
            r4 = r5
        L4d:
            if (r4 != 0) goto L51
        L4f:
            r1 = r5
            goto L80
        L51:
            java.lang.String r2 = r4.authority     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L79
            java.lang.String r4 = r4.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L79
            android.content.pm.Signature[] r0 = r0.j(r1, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L79
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L79
            r1.<init>()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L79
            int r6 = r0.length     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L79
        L5f:
            if (r3 >= r6) goto L6d
            r7 = r0[r3]     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L79
            byte[] r7 = r7.toByteArray()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L79
            r1.add(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L79
            int r3 = r3 + 1
            goto L5f
        L6d:
            java.util.List r0 = java.util.Collections.singletonList(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L79
            K1.i r1 = new K1.i     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L79
            java.lang.String r3 = "emojicompat-emoji-font"
            r1.<init>(r2, r4, r3, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L79
            goto L80
        L79:
            r0 = move-exception
            java.lang.String r1 = "emoji2.text.DefaultEmojiConfig"
            android.util.Log.wtf(r1, r0)
            goto L4f
        L80:
            if (r1 != 0) goto L83
            goto L8d
        L83:
            g1.r r5 = new g1.r
            g1.q r0 = new g1.q
            r0.<init>(r8, r1)
            r5.<init>(r0)
        L8d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a.AbstractC0423a.E(android.content.Context):g1.r");
    }

    public static final boolean F(int i2, int i3) {
        return i2 == i3;
    }

    public static final int G(int i2, ArrayList arrayList) {
        int size = arrayList.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            q qVar = (q) arrayList.get(i4);
            char c3 = qVar.f534b > i2 ? (char) 1 : qVar.f535c <= i2 ? (char) 65535 : (char) 0;
            if (c3 < 0) {
                i3 = i4 + 1;
            } else {
                if (c3 <= 0) {
                    return i4;
                }
                size = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    public static final int H(int i2, ArrayList arrayList) {
        int size = arrayList.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            q qVar = (q) arrayList.get(i4);
            char c3 = qVar.f536d > i2 ? (char) 1 : qVar.f537e <= i2 ? (char) 65535 : (char) 0;
            if (c3 < 0) {
                i3 = i4 + 1;
            } else {
                if (c3 <= 0) {
                    return i4;
                }
                size = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    public static final int I(ArrayList arrayList, float f3) {
        if (f3 <= 0.0f) {
            return 0;
        }
        if (f3 >= ((q) AbstractC0961m.M(arrayList)).f539g) {
            return AbstractC0963o.u(arrayList);
        }
        int size = arrayList.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            q qVar = (q) arrayList.get(i3);
            char c3 = qVar.f538f > f3 ? (char) 1 : qVar.f539g <= f3 ? (char) 65535 : (char) 0;
            if (c3 < 0) {
                i2 = i3 + 1;
            } else {
                if (c3 <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static final void J(ArrayList arrayList, long j3, c cVar) {
        int size = arrayList.size();
        for (int G3 = G(J.e(j3), arrayList); G3 < size; G3++) {
            q qVar = (q) arrayList.get(G3);
            if (qVar.f534b >= J.d(j3)) {
                return;
            }
            if (qVar.f534b != qVar.f535c) {
                cVar.l(qVar);
            }
        }
    }

    public static final String K(Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    public static final C0712e L() {
        C0712e c0712e = f6448d;
        if (c0712e != null) {
            return c0712e;
        }
        C0711d c0711d = new C0711d("Filled.Build", false);
        int i2 = AbstractC0732y.f7958a;
        C0578S c0578s = new C0578S(C0603v.f7272b);
        V0 v0 = new V0(1);
        v0.h(22.7f, 19.0f);
        v0.g(-9.1f, -9.1f);
        v0.c(0.9f, -2.3f, 0.4f, -5.0f, -1.5f, -6.9f);
        v0.c(-2.0f, -2.0f, -5.0f, -2.4f, -7.4f, -1.3f);
        v0.f(9.0f, 6.0f);
        v0.f(6.0f, 9.0f);
        v0.f(1.6f, 4.7f);
        v0.b(0.4f, 7.1f, 0.9f, 10.1f, 2.9f, 12.1f);
        v0.c(1.9f, 1.9f, 4.6f, 2.4f, 6.9f, 1.5f);
        v0.g(9.1f, 9.1f);
        v0.c(0.4f, 0.4f, 1.0f, 0.4f, 1.4f, 0.0f);
        v0.g(2.3f, -2.3f);
        v0.c(0.5f, -0.4f, 0.5f, -1.1f, 0.1f, -1.4f);
        v0.a();
        C0711d.a(c0711d, v0.f4104h, c0578s);
        C0712e b3 = c0711d.b();
        f6448d = b3;
        return b3;
    }

    public static final C0712e M() {
        C0712e c0712e = f6449e;
        if (c0712e != null) {
            return c0712e;
        }
        C0711d c0711d = new C0711d("Filled.Edit", false);
        int i2 = AbstractC0732y.f7958a;
        C0578S c0578s = new C0578S(C0603v.f7272b);
        V0 v0 = new V0(1);
        v0.h(3.0f, 17.25f);
        v0.k(21.0f);
        v0.e(3.75f);
        v0.f(17.81f, 9.94f);
        v0.g(-3.75f, -3.75f);
        v0.f(3.0f, 17.25f);
        v0.a();
        v0.h(20.71f, 7.04f);
        v0.c(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        v0.g(-2.34f, -2.34f);
        v0.c(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        v0.g(-1.83f, 1.83f);
        v0.g(3.75f, 3.75f);
        v0.g(1.83f, -1.83f);
        v0.a();
        C0711d.a(c0711d, v0.f4104h, c0578s);
        C0712e b3 = c0711d.b();
        f6449e = b3;
        return b3;
    }

    public static final C0712e N() {
        C0712e c0712e = f6450f;
        if (c0712e != null) {
            return c0712e;
        }
        C0711d c0711d = new C0711d("Filled.Refresh", false);
        int i2 = AbstractC0732y.f7958a;
        C0578S c0578s = new C0578S(C0603v.f7272b);
        V0 v0 = new V0(1);
        v0.h(17.65f, 6.35f);
        v0.b(16.2f, 4.9f, 14.21f, 4.0f, 12.0f, 4.0f);
        v0.c(-4.42f, 0.0f, -7.99f, 3.58f, -7.99f, 8.0f);
        v0.j(3.57f, 8.0f, 7.99f, 8.0f);
        v0.c(3.73f, 0.0f, 6.84f, -2.55f, 7.73f, -6.0f);
        v0.e(-2.08f);
        v0.c(-0.82f, 2.33f, -3.04f, 4.0f, -5.65f, 4.0f);
        v0.c(-3.31f, 0.0f, -6.0f, -2.69f, -6.0f, -6.0f);
        v0.j(2.69f, -6.0f, 6.0f, -6.0f);
        v0.c(1.66f, 0.0f, 3.14f, 0.69f, 4.22f, 1.78f);
        v0.f(13.0f, 11.0f);
        v0.e(7.0f);
        v0.k(4.0f);
        v0.g(-2.35f, 2.35f);
        v0.a();
        C0711d.a(c0711d, v0.f4104h, c0578s);
        C0712e b3 = c0711d.b();
        f6450f = b3;
        return b3;
    }

    public static final int O(int i2, int i3) {
        return (i2 >> i3) & 31;
    }

    public static final boolean P(X x2, boolean z3) {
        InterfaceC1129r c3;
        S s3 = x2.f783d;
        if (s3 == null || (c3 = s3.c()) == null) {
            return false;
        }
        d M3 = y.M(c3);
        long k3 = x2.k(z3);
        float d3 = b0.c.d(k3);
        if (M3.f7060a > d3 || d3 > M3.f7062c) {
            return false;
        }
        float e3 = b0.c.e(k3);
        return M3.f7061b <= e3 && e3 <= M3.f7063d;
    }

    public static h Q(y2.e eVar) {
        z2.h.f(eVar, "block");
        h hVar = new h();
        hVar.f1266j = AbstractC0948C.g(hVar, hVar, eVar);
        return hVar;
    }

    public static final ArrayList S(LinkedHashMap linkedHashMap, c cVar) {
        z2.h.f(linkedHashMap, "<this>");
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Iterator it = linkedHashMap.entrySet().iterator();
        if (it.hasNext()) {
            t.w(((Map.Entry) it.next()).getValue());
            z2.h.c(null);
            throw null;
        }
        Set keySet = linkedHashMap2.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : keySet) {
            if (((Boolean) cVar.l((String) obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final InterfaceC0258c0 X(Object[] objArr, K1.e eVar, y2.a aVar, C0285q c0285q) {
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        z2.h.d(eVar, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.mutableStateSaver, kotlin.Any>");
        C0018a c0018a = new C0018a(7, eVar);
        n nVar = new n(13, eVar);
        K1.e eVar2 = S.n.f5572a;
        return (InterfaceC0258c0) Y(copyOf, new K1.e(c0018a, nVar), null, aVar, c0285q, 0, 0);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v0 ??, still in use, count: 1, list:
          (r8v0 ?? I:java.lang.Object) from 0x005c: INVOKE (r13v0 ?? I:J.q), (r8v0 ?? I:java.lang.Object) VIRTUAL call: J.q.e0(java.lang.Object):void A[MD:(java.lang.Object):void (m)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    public static final java.lang.Object Y(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v0 ??, still in use, count: 1, list:
          (r8v0 ?? I:java.lang.Object) from 0x005c: INVOKE (r13v0 ?? I:J.q), (r8v0 ?? I:java.lang.Object) VIRTUAL call: J.q.e0(java.lang.Object):void A[MD:(java.lang.Object):void (m)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r9v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:238)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */

    public static final long Z(long j3) {
        return (Math.round(b0.c.e(j3)) & 4294967295L) | (Math.round(b0.c.d(j3)) << 32);
    }

    public static final long a0(float f3, long j3) {
        return B2.a.d(Math.max(0.0f, AbstractC0503a.b(j3) - f3), Math.max(0.0f, AbstractC0503a.c(j3) - f3));
    }

    public static final Object b0(s sVar, s sVar2, y2.e eVar) {
        Object c0319p;
        Object a02;
        try {
            v.d(2, eVar);
            c0319p = eVar.j(sVar2, sVar);
        } catch (Throwable th) {
            c0319p = new C0319p(th, false);
        }
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        if (c0319p == enumC1145a || (a02 = sVar.a0(c0319p)) == B.f4346e) {
            return enumC1145a;
        }
        if (a02 instanceof C0319p) {
            throw ((C0319p) a02).f4422a;
        }
        return B.x(a02);
    }

    public static final void c0(List list, InterfaceC0570J interfaceC0570J) {
        Path path;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        List list2 = list;
        C0591j c0591j = (C0591j) interfaceC0570J;
        int i2 = 0;
        int i3 = c0591j.f7260a.getFillType() == Path.FillType.EVEN_ODD ? 1 : 0;
        Path path2 = c0591j.f7260a;
        path2.rewind();
        c0591j.f(i3);
        AbstractC0727t abstractC0727t = list.isEmpty() ? C0715h.f7902b : (AbstractC0727t) list2.get(0);
        int size = list.size();
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        float f17 = 0.0f;
        while (i2 < size) {
            AbstractC0727t abstractC0727t2 = (AbstractC0727t) list2.get(i2);
            if (abstractC0727t2 instanceof C0715h) {
                path2.close();
                path = path2;
                f14 = f12;
                f16 = f14;
                f15 = f13;
                f17 = f15;
            } else if (abstractC0727t2 instanceof C0719l) {
                C0719l c0719l = (C0719l) abstractC0727t2;
                f12 = c0719l.f7912b;
                f13 = c0719l.f7913c;
                path2.moveTo(f12, f13);
                path = path2;
                f14 = f12;
                f15 = f13;
            } else {
                if (abstractC0727t2 instanceof C0723p) {
                    C0723p c0723p = (C0723p) abstractC0727t2;
                    float f18 = c0723p.f7925b;
                    float f19 = c0723p.f7926c;
                    path2.rLineTo(f18, f19);
                    f14 += c0723p.f7925b;
                    f15 += f19;
                } else {
                    if (abstractC0727t2 instanceof C0718k) {
                        C0718k c0718k = (C0718k) abstractC0727t2;
                        float f20 = c0718k.f7910b;
                        f15 = c0718k.f7911c;
                        path2.lineTo(f20, f15);
                        f10 = c0718k.f7910b;
                    } else if (abstractC0727t2 instanceof C0722o) {
                        C0722o c0722o = (C0722o) abstractC0727t2;
                        path2.rLineTo(c0722o.f7924b, f11);
                        f14 += c0722o.f7924b;
                    } else if (abstractC0727t2 instanceof C0717j) {
                        C0717j c0717j = (C0717j) abstractC0727t2;
                        path2.lineTo(c0717j.f7909b, f15);
                        f10 = c0717j.f7909b;
                    } else if (abstractC0727t2 instanceof C0725r) {
                        C0725r c0725r = (C0725r) abstractC0727t2;
                        path2.rLineTo(f11, c0725r.f7931b);
                        f15 += c0725r.f7931b;
                    } else if (abstractC0727t2 instanceof C0726s) {
                        C0726s c0726s = (C0726s) abstractC0727t2;
                        path2.lineTo(f14, c0726s.f7932b);
                        f15 = c0726s.f7932b;
                    } else {
                        if (abstractC0727t2 instanceof C0721n) {
                            C0721n c0721n = (C0721n) abstractC0727t2;
                            path = path2;
                            c0591j.f7260a.rCubicTo(c0721n.f7918b, c0721n.f7919c, c0721n.f7920d, c0721n.f7921e, c0721n.f7922f, c0721n.f7923g);
                            float f21 = c0721n.f7920d + f14;
                            f9 = c0721n.f7921e + f15;
                            f14 += c0721n.f7922f;
                            f15 += c0721n.f7923g;
                            f16 = f21;
                        } else {
                            path = path2;
                            if (abstractC0727t2 instanceof C0716i) {
                                C0716i c0716i = (C0716i) abstractC0727t2;
                                c0591j.f7260a.cubicTo(c0716i.f7903b, c0716i.f7904c, c0716i.f7905d, c0716i.f7906e, c0716i.f7907f, c0716i.f7908g);
                                f3 = c0716i.f7905d;
                                f4 = c0716i.f7906e;
                                f5 = c0716i.f7907f;
                                f6 = c0716i.f7908g;
                            } else if (abstractC0727t2 instanceof C0724q) {
                                if (abstractC0727t.f7933a) {
                                    f7 = f14 - f16;
                                    f8 = f15 - f17;
                                } else {
                                    f7 = 0.0f;
                                    f8 = 0.0f;
                                }
                                C0724q c0724q = (C0724q) abstractC0727t2;
                                c0591j.f7260a.rCubicTo(f7, f8, c0724q.f7927b, c0724q.f7928c, c0724q.f7929d, c0724q.f7930e);
                                float f22 = c0724q.f7927b + f14;
                                f9 = c0724q.f7928c + f15;
                                f14 += c0724q.f7929d;
                                f15 += c0724q.f7930e;
                                f16 = f22;
                            } else if (abstractC0727t2 instanceof C0720m) {
                                if (abstractC0727t.f7933a) {
                                    float f23 = 2;
                                    f14 = (f14 * f23) - f16;
                                    f15 = (f23 * f15) - f17;
                                }
                                C0720m c0720m = (C0720m) abstractC0727t2;
                                c0591j.f7260a.cubicTo(f14, f15, c0720m.f7914b, c0720m.f7915c, c0720m.f7916d, c0720m.f7917e);
                                f3 = c0720m.f7914b;
                                f4 = c0720m.f7915c;
                                f5 = c0720m.f7916d;
                                f6 = c0720m.f7917e;
                            }
                            f15 = f6;
                            f16 = f3;
                            f17 = f4;
                            f14 = f5;
                        }
                        f17 = f9;
                    }
                    f14 = f10;
                }
                path = path2;
            }
            i2++;
            list2 = list;
            abstractC0727t = abstractC0727t2;
            path2 = path;
            f11 = 0.0f;
        }
    }

    public static final void e(b bVar, y2.a aVar, f fVar, C0285q c0285q, int i2) {
        int i3;
        String str;
        String str2;
        z2.h.f(aVar, "onDismiss");
        c0285q.W(106649243);
        if ((i2 & 14) == 0) {
            i3 = (c0285q.g(bVar) ? 4 : 2) | i2;
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
            c0285q.U(-603413322);
            Object K3 = c0285q.K();
            W w2 = C0275l.f4150a;
            W w3 = W.f4109m;
            String str3 = "";
            if (K3 == w2) {
                if (bVar == null || (str2 = bVar.f5476b) == null) {
                    str2 = "";
                }
                K3 = C0257c.N(str2, w3);
                c0285q.e0(K3);
            }
            InterfaceC0258c0 interfaceC0258c0 = (InterfaceC0258c0) K3;
            Object g3 = t.g(c0285q, false, -603411241);
            if (g3 == w2) {
                if (bVar != null && (str = bVar.f5477c) != null) {
                    str3 = str;
                }
                g3 = C0257c.N(str3, w3);
                c0285q.e0(g3);
            }
            InterfaceC0258c0 interfaceC0258c02 = (InterfaceC0258c0) g3;
            Object g4 = t.g(c0285q, false, -603409051);
            if (g4 == w2) {
                g4 = C0257c.N(Boolean.valueOf(bVar != null ? bVar.f5481g : true), w3);
                c0285q.e0(g4);
            }
            InterfaceC0258c0 interfaceC0258c03 = (InterfaceC0258c0) g4;
            Object g5 = t.g(c0285q, false, -603406511);
            if (g5 == w2) {
                g5 = C0257c.N(null, w3);
                c0285q.e0(g5);
            }
            InterfaceC0258c0 interfaceC0258c04 = (InterfaceC0258c0) g5;
            c0285q.r(false);
            AbstractC0162o.a(aVar, R.b.c(-875009197, new C0386g(fVar, interfaceC0258c02, interfaceC0258c04, interfaceC0258c0, interfaceC0258c03, 0), c0285q), null, R.b.c(-464398831, new C0387h(aVar, 0), c0285q), null, R.b.c(-53788465, new i(1, bVar), c0285q), R.b.c(-1995966930, new C0390k(interfaceC0258c0, interfaceC0258c02, interfaceC0258c04, interfaceC0258c03), c0285q), null, 0L, 0L, 0L, 0L, 0.0f, null, c0285q, ((i4 >> 3) & 14) | 1772592, 0, 16276);
        }
        C0291t0 t3 = c0285q.t();
        if (t3 != null) {
            t3.f4235d = new C0380a(bVar, aVar, fVar, i2, 1);
        }
    }

    public static final long e0(long j3, long j4) {
        int c3;
        int e3 = J.e(j3);
        int d3 = J.d(j3);
        if (J.e(j4) >= J.d(j3) || J.e(j3) >= J.d(j4)) {
            if (d3 > J.e(j4)) {
                e3 -= J.c(j4);
                c3 = J.c(j4);
                d3 -= c3;
            }
        } else if (J.e(j4) > J.e(j3) || J.d(j3) > J.d(j4)) {
            if (J.e(j3) > J.e(j4) || J.d(j4) > J.d(j3)) {
                int e4 = J.e(j4);
                if (e3 >= J.d(j4) || e4 > e3) {
                    d3 = J.e(j4);
                } else {
                    e3 = J.e(j4);
                    c3 = J.c(j4);
                }
            } else {
                c3 = J.c(j4);
            }
            d3 -= c3;
        } else {
            e3 = J.e(j4);
            d3 = e3;
        }
        return C.j(e3, d3);
    }

    public static final void f(b bVar, y2.a aVar, y2.a aVar2, C0285q c0285q, int i2) {
        int i3;
        z2.h.f(bVar, "client");
        z2.h.f(aVar, "onEdit");
        z2.h.f(aVar2, "onDelete");
        c0285q.W(1426638583);
        if ((i2 & 14) == 0) {
            i3 = (c0285q.g(bVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= c0285q.i(aVar) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i3 |= c0285q.i(aVar2) ? 256 : 128;
        }
        if ((i3 & 731) == 146 && c0285q.A()) {
            c0285q.P();
        } else {
            AbstractC0223x4.a(androidx.compose.foundation.layout.c.f6639a, y.e.a(20), ((C0093e0) c0285q.l(AbstractC0107g0.f2597a)).f2498p, 0L, 1, 0.0f, null, R.b.c(-580325508, new C0391l(bVar, aVar, aVar2, 0), c0285q), c0285q, 12607494, 104);
        }
        C0291t0 t3 = c0285q.t();
        if (t3 != null) {
            t3.f4235d = new C0380a(bVar, aVar, aVar2, i2, 3);
        }
    }

    public static final androidx.lifecycle.X f0(z2.d dVar, c0 c0Var, V1.b bVar, G.s sVar, C0285q c0285q) {
        F f3;
        c0285q.V(1673618944);
        z2.h.f(sVar, "extras");
        if (bVar != null) {
            f3 = new F(c0Var.d(), bVar, sVar);
        } else {
            boolean z3 = c0Var instanceof InterfaceC0461j;
            if (z3) {
                b0 d3 = c0Var.d();
                Z f4 = ((InterfaceC0461j) c0Var).f();
                z2.h.f(f4, "factory");
                f3 = new F(d3, f4, sVar);
            } else {
                Z f5 = z3 ? ((InterfaceC0461j) c0Var).f() : C0856b.f8635a;
                G.s a3 = z3 ? ((InterfaceC0461j) c0Var).a() : C0783a.f8106i;
                z2.h.f(f5, "factory");
                z2.h.f(a3, "extras");
                f3 = new F(c0Var.d(), f5, a3);
            }
        }
        androidx.lifecycle.X u3 = f3.u(dVar);
        c0285q.r(false);
        return u3;
    }

    public static final void g(n1.y yVar, C0285q c0285q, int i2) {
        z2.h.f(yVar, "navController");
        c0285q.W(722029308);
        if ((i2 & 1) == 0 && c0285q.A()) {
            c0285q.P();
        } else {
            Context context = (Context) c0285q.l(AndroidCompositionLocals_androidKt.f6781b);
            Context applicationContext = context.getApplicationContext();
            z2.h.d(applicationContext, "null cannot be cast to non-null type com.example.bulksmsscheduler.SmsApplication");
            V1.b bVar = new V1.b(((SmsApplication) applicationContext).a(), null);
            c0285q.V(1729797275);
            c0 a3 = AbstractC0815b.a(c0285q);
            if (a3 == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            androidx.lifecycle.X f02 = f0(z2.t.a(P.class), a3, bVar, a3 instanceof InterfaceC0461j ? ((InterfaceC0461j) a3).a() : C0783a.f8106i, c0285q);
            c0285q.r(false);
            P p3 = (P) f02;
            InterfaceC0258c0 G3 = C.G(p3.f5967j, c0285q);
            c0285q.U(-389341540);
            Object K3 = c0285q.K();
            W w2 = C0275l.f4150a;
            W w3 = W.f4109m;
            if (K3 == w2) {
                K3 = C0257c.N("", w3);
                c0285q.e0(K3);
            }
            InterfaceC0258c0 interfaceC0258c0 = (InterfaceC0258c0) K3;
            Object g3 = t.g(c0285q, false, -389339737);
            if (g3 == w2) {
                g3 = C0257c.N(null, w3);
                c0285q.e0(g3);
            }
            InterfaceC0258c0 interfaceC0258c02 = (InterfaceC0258c0) g3;
            Object g4 = t.g(c0285q, false, -389337529);
            if (g4 == w2) {
                g4 = C0257c.N(null, w3);
                c0285q.e0(g4);
            }
            InterfaceC0258c0 interfaceC0258c03 = (InterfaceC0258c0) g4;
            Object g5 = t.g(c0285q, false, -389335321);
            if (g5 == w2) {
                g5 = C0257c.N(null, w3);
                c0285q.e0(g5);
            }
            InterfaceC0258c0 interfaceC0258c04 = (InterfaceC0258c0) g5;
            Object g6 = t.g(c0285q, false, -389333025);
            if (g6 == w2) {
                g6 = C0257c.N(Boolean.FALSE, w3);
                c0285q.e0(g6);
            }
            InterfaceC0258c0 interfaceC0258c05 = (InterfaceC0258c0) g6;
            Object g7 = t.g(c0285q, false, -389331169);
            if (g7 == w2) {
                g7 = C0257c.N(Boolean.FALSE, w3);
                c0285q.e0(g7);
            }
            InterfaceC0258c0 interfaceC0258c06 = (InterfaceC0258c0) g7;
            Object g8 = t.g(c0285q, false, -389329121);
            if (g8 == w2) {
                g8 = C0257c.N(Boolean.FALSE, w3);
                c0285q.e0(g8);
            }
            InterfaceC0258c0 interfaceC0258c07 = (InterfaceC0258c0) g8;
            c0285q.r(false);
            AbstractC0124i3.b(null, null, null, null, R.b.c(160715925, new C0394o(interfaceC0258c06, interfaceC0258c02, interfaceC0258c05, context, p3, l0.c.K(new f.a(2), new C0382c(p3, context, interfaceC0258c07), c0285q, 8), interfaceC0258c07, l0.c.K(new f.a(0), new S1.c(p3, 1, context), c0285q, 8), 1), c0285q), 0, 0L, 0L, null, R.b.c(-813400883, new W1.y(interfaceC0258c05, interfaceC0258c02, p3, interfaceC0258c03, interfaceC0258c04, G3, interfaceC0258c0, interfaceC0258c07), c0285q), c0285q, 805330944, 495);
        }
        C0291t0 t3 = c0285q.t();
        if (t3 != null) {
            t3.f4235d = new C0383d(yVar, i2, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(W1.P r23, y2.a r24, y2.a r25, J.C0285q r26, int r27) {
        /*
            r9 = r23
            r14 = r26
            java.lang.String r0 = "viewModel"
            z2.h.f(r9, r0)
            java.lang.String r0 = "onDismiss"
            r15 = r24
            z2.h.f(r15, r0)
            r0 = -181339739(0xfffffffff530f9a5, float:-2.2434269E32)
            r14.W(r0)
            M2.K r0 = r9.f5966i
            J.c0 r8 = B1.C.G(r0, r14)
            M2.K r0 = r9.f5965h
            J.c0 r7 = B1.C.G(r0, r14)
            M2.K r0 = r9.f5962e
            J.c0 r3 = B1.C.G(r0, r14)
            java.lang.Object r0 = r8.getValue()
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r0 = r0.iterator()
        L37:
            boolean r1 = r0.hasNext()
            r2 = 1
            if (r1 == 0) goto L4e
            java.lang.Object r1 = r0.next()
            r4 = r1
            W1.U r4 = (W1.U) r4
            boolean r4 = r4.f6004c
            r2 = r2 ^ r4
            if (r2 == 0) goto L37
            r6.add(r1)
            goto L37
        L4e:
            boolean r0 = r6.isEmpty()
            r0 = r0 ^ r2
            if (r0 == 0) goto L7d
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L5c
            goto L7b
        L5c:
            java.util.Iterator r0 = r6.iterator()
        L60:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L7b
            java.lang.Object r1 = r0.next()
            W1.U r1 = (W1.U) r1
            java.lang.Object r4 = r7.getValue()
            java.util.Set r4 = (java.util.Set) r4
            java.lang.String r1 = r1.f6003b
            boolean r1 = r4.contains(r1)
            if (r1 != 0) goto L60
            goto L7d
        L7b:
            r5 = r2
            goto L7f
        L7d:
            r0 = 0
            r5 = r0
        L7f:
            androidx.compose.foundation.layout.FillElement r10 = androidx.compose.foundation.layout.c.f6640b
            J.X0 r0 = H.AbstractC0107g0.f2597a
            java.lang.Object r0 = r14.l(r0)
            H.e0 r0 = (H.C0093e0) r0
            long r12 = r0.f2496n
            W1.C r11 = new W1.C
            r0 = r11
            r1 = r25
            r2 = r24
            r4 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = 1902391552(0x71643100, float:1.1299491E30)
            R.a r19 = R.b.c(r0, r11, r14)
            r17 = 0
            r18 = 0
            r11 = 0
            r0 = 0
            r16 = 0
            r21 = 12582918(0xc00006, float:1.7632424E-38)
            r22 = 122(0x7a, float:1.71E-43)
            r14 = r0
            r20 = r26
            H.AbstractC0223x4.a(r10, r11, r12, r14, r16, r17, r18, r19, r20, r21, r22)
            J.t0 r6 = r26.t()
            if (r6 == 0) goto Lc9
            W1.a r7 = new W1.a
            r5 = 0
            r0 = r7
            r1 = r23
            r2 = r24
            r3 = r25
            r4 = r27
            r0.<init>(r1, r2, r3, r4, r5)
            r6.f4235d = r7
        Lc9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.AbstractC0423a.h(W1.P, y2.a, y2.a, J.q, int):void");
    }

    public static final void i(U u3, boolean z3, y2.a aVar, C0285q c0285q, int i2) {
        int i3;
        long j3;
        c0285q.W(-1923534351);
        if ((i2 & 14) == 0) {
            i3 = (c0285q.g(u3) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= c0285q.h(z3) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i3 |= c0285q.i(aVar) ? 256 : 128;
        }
        if ((i3 & 731) == 146 && c0285q.A()) {
            c0285q.P();
        } else {
            C1396d a3 = y.e.a(12);
            if (z3) {
                c0285q.U(1699239168);
                j3 = ((C0093e0) c0285q.l(AbstractC0107g0.f2597a)).f2485c;
            } else {
                c0285q.U(1699240695);
                j3 = ((C0093e0) c0285q.l(AbstractC0107g0.f2597a)).f2498p;
            }
            c0285q.r(false);
            float f3 = 1;
            FillElement fillElement = androidx.compose.foundation.layout.c.f6639a;
            c0285q.U(1699234523);
            boolean z4 = ((i3 & 14) == 4) | ((i3 & 896) == 256);
            Object K3 = c0285q.K();
            if (z4 || K3 == C0275l.f4150a) {
                K3 = new P1.f(u3, 1, aVar);
                c0285q.e0(K3);
            }
            c0285q.r(false);
            AbstractC0223x4.c((y2.a) K3, fillElement, false, a3, j3, 0L, f3, 0.0f, null, null, R.b.c(1137644284, new E(z3, u3, aVar), c0285q), c0285q, 1572912, 932);
        }
        C0291t0 t3 = c0285q.t();
        if (t3 != null) {
            t3.f4235d = new C0381b(u3, z3, aVar, i2);
        }
    }

    public static final void j(C0712e c0712e, String str, y2.a aVar, C0285q c0285q, int i2) {
        int i3;
        z2.h.f(aVar, "onClick");
        c0285q.W(1827009873);
        if ((i2 & 14) == 0) {
            i3 = (c0285q.g(c0712e) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= c0285q.g(str) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i3 |= c0285q.i(aVar) ? 256 : 128;
        }
        if ((i3 & 731) == 146 && c0285q.A()) {
            c0285q.P();
        } else {
            C1396d a3 = y.e.a(16);
            X0 x02 = AbstractC0107g0.f2597a;
            AbstractC0223x4.c(aVar, null, false, a3, C0603v.b(0.1f, ((C0093e0) c0285q.l(x02)).f2483a), ((C0093e0) c0285q.l(x02)).f2483a, 2, 0.0f, null, null, R.b.c(1067273308, new l(c0712e, 1, str), c0285q), c0285q, ((i3 >> 6) & 14) | 1572864, 902);
        }
        C0291t0 t3 = c0285q.t();
        if (t3 != null) {
            t3.f4235d = new C0380a(c0712e, str, aVar, i2);
        }
    }

    public static final void k(String str, String str2, C0285q c0285q, int i2) {
        int i3;
        int i4;
        z2.h.f(str, "name");
        z2.h.f(str2, "phone");
        c0285q.W(-1571347606);
        if ((i2 & 14) == 0) {
            i3 = (c0285q.g(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 11) == 2 && c0285q.A()) {
            c0285q.P();
            i4 = i2;
        } else {
            i4 = i2;
            AbstractC0223x4.a(androidx.compose.foundation.layout.c.f6639a, y.e.a(20), ((C0093e0) c0285q.l(AbstractC0107g0.f2597a)).f2498p, 0L, 1, 0.0f, null, R.b.c(816273029, new X1.d(str, 1), c0285q), c0285q, 12607494, 104);
        }
        C0291t0 t3 = c0285q.t();
        if (t3 != null) {
            t3.f4235d = new b2.d(i4, 0, str2, str);
        }
    }

    public static final void l(final n1.y yVar, final H h2, C0285q c0285q, int i2) {
        InterfaceC0328z interfaceC0328z;
        Z3 z3;
        boolean z4;
        final H h3;
        final InterfaceC0258c0 interfaceC0258c0;
        z2.h.f(yVar, "navController");
        z2.h.f(h2, "viewModel");
        c0285q.W(899776942);
        InterfaceC0258c0 G3 = C.G(h2.f6269g, c0285q);
        InterfaceC0258c0 G4 = C.G(h2.f6267e, c0285q);
        InterfaceC0258c0 G5 = C.G(h2.f6268f, c0285q);
        InterfaceC0258c0 G6 = C.G(h2.f6273k, c0285q);
        InterfaceC0258c0 G7 = C.G(h2.f6270h, c0285q);
        InterfaceC0258c0 G8 = C.G(h2.f6272j, c0285q);
        c0285q.U(1251613195);
        Object K3 = c0285q.K();
        W w2 = C0275l.f4150a;
        if (K3 == w2) {
            K3 = C0257c.N(Boolean.FALSE, W.f4109m);
            c0285q.e0(K3);
        }
        InterfaceC0258c0 interfaceC0258c02 = (InterfaceC0258c0) K3;
        Object g3 = t.g(c0285q, false, 1251615369);
        if (g3 == w2) {
            g3 = new Z3();
            c0285q.e0(g3);
        }
        Z3 z32 = (Z3) g3;
        c0285q.r(false);
        Object K4 = c0285q.K();
        if (K4 == w2) {
            C0302z c0302z = new C0302z(C0257c.B(c0285q));
            c0285q.e0(c0302z);
            K4 = c0302z;
        }
        InterfaceC0328z interfaceC0328z2 = ((C0302z) K4).f4298h;
        c0285q.U(1251618649);
        Object K5 = c0285q.K();
        if (K5 == w2) {
            K5 = new SimpleDateFormat("EEEE, MMM d", Locale.getDefault()).format(new Date());
            c0285q.e0(K5);
        }
        String str = (String) K5;
        c0285q.r(false);
        o oVar = (o) G3.getValue();
        c0285q.U(1251621882);
        boolean g4 = c0285q.g(oVar);
        Object K6 = c0285q.K();
        if (g4 || K6 == w2) {
            K6 = Float.valueOf(((o) G3.getValue()).f6336a > 0 ? ((o) G3.getValue()).f6337b / ((o) G3.getValue()).f6336a : 0.0f);
            c0285q.e0(K6);
        }
        float floatValue = ((Number) K6).floatValue();
        c0285q.r(false);
        c0285q.U(1251626482);
        if (((Boolean) G8.getValue()).booleanValue()) {
            R1.a aVar = (R1.a) G7.getValue();
            if (aVar == null) {
                aVar = new R1.a();
            }
            interfaceC0328z = interfaceC0328z2;
            z3 = z32;
            z4 = false;
            r(aVar.f5467b, aVar.f5468c, aVar.f5469d, new V1.a(2, h2), new y2.e() { // from class: Y1.d
                @Override // y2.e
                public final Object j(Object obj, Object obj2) {
                    String str2 = (String) obj;
                    boolean booleanValue = ((Boolean) obj2).booleanValue();
                    H h4 = H.this;
                    z2.h.f(h4, "$viewModel");
                    n1.y yVar2 = yVar;
                    z2.h.f(yVar2, "$navController");
                    z2.h.f(str2, "date");
                    String obj3 = H2.l.h0(H2.l.b0(str2, "\n", "")).toString();
                    z2.h.f(obj3, "selectedDate");
                    J2.B.r(Q.j(h4), null, 0, new E(h4, obj3, booleanValue, null), 3);
                    h4.f6271i.k(Boolean.FALSE);
                    String str3 = S1.i.f5614d.f5618a;
                    P1.g gVar = new P1.g(yVar2, 1);
                    z2.h.f(str3, "route");
                    n1.y.l(yVar2, str3, AbstractC0948C.l(gVar), 4);
                    return C0880v.f8657a;
                }
            }, c0285q, 0);
        } else {
            interfaceC0328z = interfaceC0328z2;
            z3 = z32;
            z4 = false;
        }
        c0285q.r(z4);
        Z3 z33 = z3;
        AbstractC0124i3.b(null, null, null, R.b.c(-50705676, new i(2, z33), c0285q), null, 0, ((C0093e0) c0285q.l(AbstractC0107g0.f2597a)).f2496n, 0L, null, R.b.c(673303165, new Y1.n(str, yVar, G7, interfaceC0328z, h2, G4, z33, G5, floatValue, G3, interfaceC0258c02, G6), c0285q), c0285q, 805309440, 439);
        if (((Boolean) interfaceC0258c02.getValue()).booleanValue()) {
            int i3 = ((o) G3.getValue()).f6338c;
            c0285q.U(1251961252);
            Object K7 = c0285q.K();
            if (K7 == w2) {
                interfaceC0258c0 = interfaceC0258c02;
                K7 = new C0392m(interfaceC0258c0, 9);
                c0285q.e0(K7);
            } else {
                interfaceC0258c0 = interfaceC0258c02;
            }
            c0285q.r(false);
            final int i4 = 0;
            h3 = h2;
            final int i5 = 1;
            o(i3, (y2.a) K7, new y2.a() { // from class: Y1.e
                @Override // y2.a
                public final Object c() {
                    switch (i4) {
                        case 0:
                            H h4 = h3;
                            z2.h.f(h4, "$viewModel");
                            InterfaceC0258c0 interfaceC0258c03 = interfaceC0258c0;
                            z2.h.f(interfaceC0258c03, "$showRetryDialog$delegate");
                            J2.B.r(Q.j(h4), null, 0, new y(h4, true, null), 3);
                            interfaceC0258c03.setValue(Boolean.FALSE);
                            break;
                        default:
                            H h5 = h3;
                            z2.h.f(h5, "$viewModel");
                            InterfaceC0258c0 interfaceC0258c04 = interfaceC0258c0;
                            z2.h.f(interfaceC0258c04, "$showRetryDialog$delegate");
                            J2.B.r(Q.j(h5), null, 0, new y(h5, false, null), 3);
                            interfaceC0258c04.setValue(Boolean.FALSE);
                            break;
                    }
                    return C0880v.f8657a;
                }
            }, new y2.a() { // from class: Y1.e
                @Override // y2.a
                public final Object c() {
                    switch (i5) {
                        case 0:
                            H h4 = h3;
                            z2.h.f(h4, "$viewModel");
                            InterfaceC0258c0 interfaceC0258c03 = interfaceC0258c0;
                            z2.h.f(interfaceC0258c03, "$showRetryDialog$delegate");
                            J2.B.r(Q.j(h4), null, 0, new y(h4, true, null), 3);
                            interfaceC0258c03.setValue(Boolean.FALSE);
                            break;
                        default:
                            H h5 = h3;
                            z2.h.f(h5, "$viewModel");
                            InterfaceC0258c0 interfaceC0258c04 = interfaceC0258c0;
                            z2.h.f(interfaceC0258c04, "$showRetryDialog$delegate");
                            J2.B.r(Q.j(h5), null, 0, new y(h5, false, null), 3);
                            interfaceC0258c04.setValue(Boolean.FALSE);
                            break;
                    }
                    return C0880v.f8657a;
                }
            }, c0285q, 48);
        } else {
            h3 = h2;
        }
        C0291t0 t3 = c0285q.t();
        if (t3 != null) {
            t3.f4235d = new S1.d(yVar, h3, i2, 1);
        }
    }

    public static final long m(int i2, int i3) {
        return (i3 & 4294967295L) | (i2 << 32);
    }

    public static final d n(long j3, long j4) {
        return new d(b0.c.d(j3), b0.c.e(j3), b0.f.d(j4) + b0.c.d(j3), b0.f.b(j4) + b0.c.e(j3));
    }

    public static final void o(final int i2, final y2.a aVar, final y2.a aVar2, final y2.a aVar3, C0285q c0285q, final int i3) {
        int i4;
        z2.h.f(aVar, "onDismiss");
        c0285q.W(399854740);
        if ((i3 & 14) == 0) {
            i4 = (c0285q.e(i2) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 112) == 0) {
            i4 |= c0285q.i(aVar) ? 32 : 16;
        }
        if ((i3 & 896) == 0) {
            i4 |= c0285q.i(aVar2) ? 256 : 128;
        }
        if ((i3 & 7168) == 0) {
            i4 |= c0285q.i(aVar3) ? 2048 : 1024;
        }
        int i5 = i4;
        if ((i5 & 5851) == 1170 && c0285q.A()) {
            c0285q.P();
        } else {
            AbstractC0162o.a(aVar, R.b.c(1523750108, new C0391l(aVar2, aVar3, aVar), c0285q), null, null, null, Z1.c.f6421k, R.b.c(845234977, new Z1.j(i2), c0285q), null, 0L, 0L, 0L, 0L, 0.0f, null, c0285q, ((i5 >> 3) & 14) | 1769520, 0, 16284);
        }
        C0291t0 t3 = c0285q.t();
        if (t3 != null) {
            t3.f4235d = new y2.e() { // from class: Z1.h
                @Override // y2.e
                public final Object j(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    y2.a aVar4 = aVar;
                    z2.h.f(aVar4, "$onDismiss");
                    y2.a aVar5 = aVar2;
                    z2.h.f(aVar5, "$onRetryNow");
                    y2.a aVar6 = aVar3;
                    z2.h.f(aVar6, "$onAddToPlan");
                    AbstractC0423a.o(i2, aVar4, aVar5, aVar6, (C0285q) obj, C0257c.Y(i3 | 1));
                    return C0880v.f8657a;
                }
            };
        }
    }

    public static final void p(int i2, C0285q c0285q) {
        c0285q.W(1994767831);
        if (i2 == 0 && c0285q.A()) {
            c0285q.P();
        } else {
            Context context = (Context) c0285q.l(AndroidCompositionLocals_androidKt.f6781b);
            Context applicationContext = context.getApplicationContext();
            z2.h.d(applicationContext, "null cannot be cast to non-null type com.example.bulksmsscheduler.SmsApplication");
            V1.b bVar = new V1.b(((SmsApplication) applicationContext).a(), context);
            c0285q.V(1729797275);
            c0 a3 = AbstractC0815b.a(c0285q);
            if (a3 == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            androidx.lifecycle.X f02 = f0(z2.t.a(a2.l.class), a3, bVar, a3 instanceof InterfaceC0461j ? ((InterfaceC0461j) a3).a() : C0783a.f8106i, c0285q);
            c0285q.r(false);
            a2.l lVar = (a2.l) f02;
            AbstractC0124i3.b(null, null, null, null, R.b.c(1128619614, new i(5, lVar), c0285q), 0, 0L, 0L, null, R.b.c(-1586920154, new A(C.G(lVar.f6532h, c0285q), 1), c0285q), c0285q, 805330944, 495);
        }
        C0291t0 t3 = c0285q.t();
        if (t3 != null) {
            t3.f4235d = new P1.e(i2, 3);
        }
    }

    public static final void q(int i2, C0285q c0285q) {
        c0285q.W(949779489);
        if (i2 == 0 && c0285q.A()) {
            c0285q.P();
        } else {
            D1.b(androidx.compose.foundation.layout.c.f6639a, y.e.a(24), D1.l(C0603v.b(0.5f, ((C0093e0) c0285q.l(AbstractC0107g0.f2597a)).f2499r), c0285q, 0), null, null, b2.c.f7153c, c0285q, 196614, 24);
        }
        C0291t0 t3 = c0285q.t();
        if (t3 != null) {
            t3.f4235d = new P1.e(i2, 4);
        }
    }

    public static final void r(final String str, final String str2, final boolean z3, final y2.a aVar, final y2.e eVar, C0285q c0285q, final int i2) {
        int i3;
        LocalTime of;
        LocalTime of2;
        boolean z4;
        int i4;
        InterfaceC0258c0 interfaceC0258c0;
        InterfaceC0258c0 interfaceC0258c02;
        InterfaceC0258c0 interfaceC0258c03;
        C0285q c0285q2;
        z2.h.f(str, "workStartTime");
        z2.h.f(str2, "workEndTime");
        c0285q.W(2082524433);
        if ((i2 & 14) == 0) {
            i3 = (c0285q.g(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= c0285q.g(str2) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i3 |= c0285q.h(z3) ? 256 : 128;
        }
        if ((i2 & 7168) == 0) {
            i3 |= c0285q.i(aVar) ? 2048 : 1024;
        }
        if ((57344 & i2) == 0) {
            i3 |= c0285q.i(eVar) ? 16384 : 8192;
        }
        int i5 = i3;
        if ((46811 & i5) == 9362 && c0285q.A()) {
            c0285q.P();
        } else {
            c0285q.U(-301510295);
            boolean z5 = ((i5 & 14) == 4) | ((i5 & 112) == 32) | ((i5 & 896) == 256);
            Object K3 = c0285q.K();
            Object obj = C0275l.f4150a;
            if (z5 || K3 == obj) {
                LocalDateTime now = LocalDateTime.now();
                try {
                    of = LocalTime.parse(str);
                } catch (Exception unused) {
                    of = LocalTime.of(9, 0);
                }
                try {
                    of2 = LocalTime.parse(str2);
                } catch (Exception unused2) {
                    of2 = LocalTime.of(18, 0);
                }
                LocalDateTime withNano = now.withSecond(0).withNano(0);
                LocalTime localTime = withNano.toLocalTime();
                if (localTime.isBefore(of)) {
                    withNano = withNano.with((TemporalAdjuster) of);
                } else if (localTime.isAfter(of2)) {
                    withNano = withNano.plusDays(1L).with((TemporalAdjuster) of);
                }
                while (z3 && withNano.getDayOfWeek() == DayOfWeek.SUNDAY) {
                    withNano = withNano.plusDays(1L).with((TemporalAdjuster) of);
                }
                c0285q.e0(withNano);
                K3 = withNano;
            }
            LocalDateTime localDateTime = (LocalDateTime) K3;
            Object g3 = t.g(c0285q, false, -301485535);
            W w2 = W.f4109m;
            if (g3 == obj) {
                g3 = C0257c.N(localDateTime.toLocalDate(), w2);
                c0285q.e0(g3);
            }
            InterfaceC0258c0 interfaceC0258c04 = (InterfaceC0258c0) g3;
            Object g4 = t.g(c0285q, false, -301482775);
            if (g4 == obj) {
                g4 = C0257c.N(Boolean.FALSE, w2);
                c0285q.e0(g4);
            }
            InterfaceC0258c0 interfaceC0258c05 = (InterfaceC0258c0) g4;
            Object g5 = t.g(c0285q, false, -301480663);
            if (g5 == obj) {
                g5 = C0257c.N(Boolean.FALSE, w2);
                c0285q.e0(g5);
            }
            InterfaceC0258c0 interfaceC0258c06 = (InterfaceC0258c0) g5;
            c0285q.r(false);
            DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern("MMM dd, yyyy");
            c0285q.U(-301475853);
            if (((Boolean) interfaceC0258c06.getValue()).booleanValue()) {
                Long valueOf = Long.valueOf(((LocalDate) interfaceC0258c04.getValue()).atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli());
                Z1.k kVar = new Z1.k();
                float f3 = A1.f1287a;
                c0285q.V(2065763010);
                E2.d dVar = E0.f1424b;
                Locale p3 = D1.p(c0285q);
                Object[] objArr = new Object[0];
                K1.e I3 = K1.f.I(C0114h0.f2635A, new C0053w(kVar, 3, p3));
                c0285q.V(-1398082866);
                boolean g6 = c0285q.g(valueOf) | c0285q.g(valueOf) | c0285q.i(dVar) | c0285q.e(0) | c0285q.g(kVar) | c0285q.i(p3);
                Object K4 = c0285q.K();
                if (g6 || K4 == obj) {
                    K4 = new C0226y1(valueOf, valueOf, dVar, 0, kVar, p3);
                    c0285q.e0(K4);
                }
                c0285q.r(false);
                z4 = false;
                i4 = i5;
                interfaceC0258c0 = interfaceC0258c06;
                B1 b12 = (B1) Y(objArr, I3, null, (y2.a) K4, c0285q, 0, 4);
                Object g7 = t.g(c0285q, false, -301457663);
                if (g7 == obj) {
                    g7 = new C0392m(interfaceC0258c0, 11);
                    c0285q.e0(g7);
                }
                c0285q.r(false);
                interfaceC0258c02 = interfaceC0258c05;
                interfaceC0258c03 = interfaceC0258c04;
                c0285q2 = c0285q;
                I0.a((y2.a) g7, R.b.c(1926617476, new C0391l(b12, interfaceC0258c04, interfaceC0258c0, 3), c0285q), null, R.b.c(-39369278, new C0389j(interfaceC0258c0, 6), c0285q), null, 0.0f, null, null, R.b.c(-120928563, new P1.j(1, b12), c0285q), c0285q, 100666422, 244);
            } else {
                z4 = false;
                i4 = i5;
                interfaceC0258c0 = interfaceC0258c06;
                interfaceC0258c02 = interfaceC0258c05;
                interfaceC0258c03 = interfaceC0258c04;
                c0285q2 = c0285q;
            }
            c0285q2.r(z4);
            InterfaceC0258c0 interfaceC0258c07 = interfaceC0258c02;
            InterfaceC0258c0 interfaceC0258c08 = interfaceC0258c03;
            AbstractC0162o.a(aVar, R.b.c(441182553, new C0391l(eVar, interfaceC0258c08, interfaceC0258c07, 4), c0285q2), null, R.b.c(939739355, new C0387h(aVar, 1 == true ? 1 : 0), c0285q2), null, Z1.c.f6415e, R.b.c(1687574558, new C0390k(ofPattern, interfaceC0258c07, interfaceC0258c08, interfaceC0258c0, 1), c0285q2), null, 0L, 0L, 0L, 0L, 0.0f, new R0.s(7, true), c0285q, ((i4 >> 9) & 14) | 1772592, 3072, 8084);
        }
        C0291t0 t3 = c0285q.t();
        if (t3 != null) {
            t3.f4235d = new y2.e() { // from class: Z1.i
                @Override // y2.e
                public final Object j(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    String str3 = str;
                    z2.h.f(str3, "$workStartTime");
                    String str4 = str2;
                    z2.h.f(str4, "$workEndTime");
                    y2.a aVar2 = aVar;
                    z2.h.f(aVar2, "$onDismiss");
                    y2.e eVar2 = eVar;
                    z2.h.f(eVar2, "$onConfirm");
                    AbstractC0423a.r(str3, str4, z3, aVar2, eVar2, (C0285q) obj2, C0257c.Y(i2 | 1));
                    return C0880v.f8657a;
                }
            };
        }
    }

    public static final void s(boolean z3, N0.h hVar, X x2, C0285q c0285q, int i2) {
        int i3;
        c0285q.W(-1344558920);
        if ((i2 & 6) == 0) {
            i3 = (c0285q.h(z3) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= c0285q.g(hVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= c0285q.i(x2) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && c0285q.A()) {
            c0285q.P();
        } else {
            int i4 = i3 & 14;
            boolean g3 = (i4 == 4) | c0285q.g(x2);
            Object K3 = c0285q.K();
            Object obj = C0275l.f4150a;
            if (g3 || K3 == obj) {
                x2.getClass();
                K3 = new V(x2, z3);
                c0285q.e0(K3);
            }
            a0 a0Var = (a0) K3;
            boolean i5 = c0285q.i(x2) | (i4 == 4);
            Object K4 = c0285q.K();
            if (i5 || K4 == obj) {
                K4 = new Y(x2, z3);
                c0285q.e0(K4);
            }
            InterfaceC0045n interfaceC0045n = (InterfaceC0045n) K4;
            boolean f3 = J.f(x2.l().f3933b);
            V.l lVar = V.l.f5857b;
            boolean i6 = c0285q.i(a0Var);
            Object K5 = c0285q.K();
            if (i6 || K5 == obj) {
                K5 = new D.Z(a0Var, null);
                c0285q.e0(K5);
            }
            int i7 = i3 << 3;
            K1.f.h(interfaceC0045n, z3, hVar, f3, 0L, w.a(lVar, a0Var, (y2.e) K5), c0285q, (i7 & 112) | (i7 & 896), 16);
        }
        C0291t0 t3 = c0285q.t();
        if (t3 != null) {
            t3.f4235d = new C0038g(z3, hVar, x2, i2);
        }
    }

    public static final void t(final int i2, final int i3, C0285q c0285q) {
        int i4;
        c0285q.W(443071952);
        if ((i3 & 14) == 0) {
            i4 = (c0285q.e(i2) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i4 & 11) == 2 && c0285q.A()) {
            c0285q.P();
        } else {
            D1.b(androidx.compose.foundation.layout.c.f6639a, y.e.a(24), D1.l(((C0093e0) c0285q.l(AbstractC0107g0.f2597a)).f2485c, c0285q, 0), null, null, R.b.c(874066882, new W1.F(i2), c0285q), c0285q, 196614, 24);
        }
        C0291t0 t3 = c0285q.t();
        if (t3 != null) {
            t3.f4235d = new y2.e() { // from class: W1.e
                @Override // y2.e
                public final Object j(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int Y2 = C0257c.Y(i3 | 1);
                    AbstractC0423a.t(i2, Y2, (C0285q) obj);
                    return C0880v.f8657a;
                }
            };
        }
    }

    public static final void u(int i2, List list) {
        int size = list.size();
        if (i2 < 0 || i2 >= size) {
            throw new IndexOutOfBoundsException("Index " + i2 + " is out of bounds. The list has " + size + " elements.");
        }
    }

    public static final void v(List list, int i2, int i3) {
        int size = list.size();
        if (i2 > i3) {
            throw new IllegalArgumentException("Indices are out of order. fromIndex (" + i2 + ") is greater than toIndex (" + i3 + ").");
        }
        if (i2 < 0) {
            throw new IndexOutOfBoundsException("fromIndex (" + i2 + ") is less than 0.");
        }
        if (i3 <= size) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i3 + ") is more than than the list size (" + size + ')');
    }

    public static final Object[] w(Object[] objArr, int i2, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        AbstractC0959k.s(objArr, objArr2, 0, i2, 6);
        AbstractC0959k.q(objArr, objArr2, i2 + 2, i2, objArr.length);
        objArr2[i2] = obj;
        objArr2[i2 + 1] = obj2;
        return objArr2;
    }

    public static final Object[] x(Object[] objArr, int i2) {
        Object[] objArr2 = new Object[objArr.length - 2];
        AbstractC0959k.s(objArr, objArr2, 0, i2, 6);
        AbstractC0959k.q(objArr, objArr2, i2, i2 + 2, objArr.length);
        return objArr2;
    }

    public static final Object[] y(Object[] objArr, int i2) {
        Object[] objArr2 = new Object[objArr.length - 1];
        AbstractC0959k.s(objArr, objArr2, 0, i2, 6);
        AbstractC0959k.q(objArr, objArr2, i2, i2 + 1, objArr.length);
        return objArr2;
    }

    public static final ExtractedText z(z zVar) {
        ExtractedText extractedText = new ExtractedText();
        String str = zVar.f3932a.f500a;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j3 = zVar.f3933b;
        extractedText.selectionStart = J.e(j3);
        extractedText.selectionEnd = J.d(j3);
        String str2 = zVar.f3932a.f500a;
        z2.h.f(str2, "<this>");
        extractedText.flags = (H2.l.T(str2, '\n', 0, false, 2) >= 0 ? 1 : 0) ^ 1;
        return extractedText;
    }

    public abstract boolean A(M1.i iVar, M1.d dVar, M1.d dVar2);

    public abstract boolean B(M1.i iVar, Object obj, Object obj2);

    public abstract boolean C(M1.i iVar, M1.h hVar, M1.h hVar2);

    public abstract void R(Serializable serializable);

    public abstract int T(int i2);

    public abstract int U(int i2);

    public abstract void V(M1.h hVar, M1.h hVar2);

    public abstract void W(M1.h hVar, Thread thread);

    @Override // E0.e
    public int a(int i2) {
        return U(i2);
    }

    @Override // E0.e
    public int b(int i2) {
        return T(i2);
    }

    @Override // E0.e
    public int c(int i2) {
        int T3 = T(i2);
        if (T3 == -1 || T(T3) == -1) {
            return -1;
        }
        return T3;
    }

    @Override // E0.e
    public int d(int i2) {
        int U3 = U(i2);
        if (U3 == -1 || U(U3) == -1) {
            return -1;
        }
        return U3;
    }

    public abstract void d0();
}
