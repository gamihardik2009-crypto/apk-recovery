package l0;

import B.C0000a;
import B1.C;
import B1.ThreadFactoryC0012b;
import C0.C0019b;
import C0.H;
import C0.J;
import C0.K;
import D.C0046o;
import D.C0047p;
import D.C0048q;
import D.C0049s;
import D.C0050t;
import D.InterfaceC0042k;
import D.S;
import D.X;
import D.e0;
import G2.g;
import G2.i;
import H0.k;
import I0.z;
import J.B;
import J.C0257c;
import J.C0275l;
import J.C0285q;
import J.G;
import J.G0;
import J.InterfaceC0259d;
import J.V0;
import K1.f;
import O0.m;
import O0.n;
import S.j;
import S.l;
import V.o;
import a.AbstractC0423a;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b.AbstractActivityC0489m;
import b0.AbstractC0503a;
import c.AbstractC0554d;
import c.C0551a;
import c.C0552b;
import c.C0556f;
import c0.AbstractC0571K;
import c0.C0578S;
import c0.C0603v;
import e1.AbstractC0657a;
import i0.AbstractC0732y;
import i0.AbstractC0733z;
import i0.C0707B;
import i0.C0709b;
import i0.C0711d;
import i0.C0712e;
import i0.C0714g;
import i0.C0731x;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import m2.EnumC0863e;
import m2.InterfaceC0862d;
import n.C0911t;
import n.b0;
import n1.C0941b;
import n1.s;
import n2.AbstractC0959k;
import n2.C0970v;
import t0.AbstractC1265x;
import z2.h;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static C0712e f8279a;

    /* renamed from: b, reason: collision with root package name */
    public static C0712e f8280b;

    /* renamed from: c, reason: collision with root package name */
    public static C0712e f8281c;

    public static String A(Context context, int i2) {
        String valueOf;
        h.f(context, "context");
        if (i2 <= 16777215) {
            return String.valueOf(i2);
        }
        try {
            valueOf = context.getResources().getResourceName(i2);
        } catch (Resources.NotFoundException unused) {
            valueOf = String.valueOf(i2);
        }
        h.e(valueOf, "try {\n                  …tring()\n                }");
        return valueOf;
    }

    public static g B(s sVar) {
        h.f(sVar, "<this>");
        return i.i0(sVar, C0941b.f9021o);
    }

    public static final long C(KeyEvent keyEvent) {
        return f.d(keyEvent.getKeyCode());
    }

    public static final int D(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            return action != 1 ? 0 : 1;
        }
        return 2;
    }

    public static final int E(int i2, int i3) {
        return (i2 >> i3) & 31;
    }

    public static boolean F(int i2) {
        int type = Character.getType(i2);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    public static final boolean G(b0.e eVar) {
        float b3 = AbstractC0503a.b(eVar.f7068e);
        long j3 = eVar.f7068e;
        if (b3 == AbstractC0503a.c(j3)) {
            float b4 = AbstractC0503a.b(j3);
            long j4 = eVar.f7069f;
            if (b4 == AbstractC0503a.b(j4) && AbstractC0503a.b(j3) == AbstractC0503a.c(j4)) {
                float b5 = AbstractC0503a.b(j3);
                long j5 = eVar.f7070g;
                if (b5 == AbstractC0503a.b(j5) && AbstractC0503a.b(j3) == AbstractC0503a.c(j5)) {
                    float b6 = AbstractC0503a.b(j3);
                    long j6 = eVar.f7071h;
                    if (b6 == AbstractC0503a.b(j6) && AbstractC0503a.b(j3) == AbstractC0503a.c(j6)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final void J(G0 g02, InterfaceC0259d interfaceC0259d, int i2) {
        while (true) {
            int i3 = g02.f4034u;
            if (i2 > i3 && i2 < g02.f4033t) {
                return;
            }
            if (i3 == 0 && i2 == 0) {
                return;
            }
            g02.F();
            if (C0257c.m(g02.f4016b, g02.p(g02.f4034u))) {
                interfaceC0259d.c();
            }
            g02.i();
        }
    }

    public static final C0556f K(C c3, y2.c cVar, C0285q c0285q, int i2) {
        c0285q.V(-1408504823);
        C0257c.R(c3, c0285q);
        Object R3 = C0257c.R(cVar, c0285q);
        Object obj = (String) AbstractC0423a.Y(new Object[0], null, null, C0552b.f7160j, c0285q, 3072, 6);
        B b3 = AbstractC0554d.f7165a;
        c0285q.V(1418020823);
        e.e eVar = (e.e) c0285q.l(AbstractC0554d.f7165a);
        if (eVar == null) {
            Object obj2 = (Context) c0285q.l(AndroidCompositionLocals_androidKt.f6781b);
            while (true) {
                if (!(obj2 instanceof ContextWrapper)) {
                    obj2 = null;
                    break;
                }
                if (obj2 instanceof e.e) {
                    break;
                }
                obj2 = ((ContextWrapper) obj2).getBaseContext();
            }
            eVar = (e.e) obj2;
        }
        c0285q.r(false);
        if (eVar == null) {
            throw new IllegalStateException("No ActivityResultRegistryOwner was provided via LocalActivityResultRegistryOwner".toString());
        }
        AbstractActivityC0489m abstractActivityC0489m = (AbstractActivityC0489m) eVar;
        c0285q.V(-1672765924);
        Object K3 = c0285q.K();
        Object obj3 = C0275l.f4150a;
        if (K3 == obj3) {
            K3 = new C0551a();
            c0285q.e0(K3);
        }
        C0551a c0551a = (C0551a) K3;
        c0285q.r(false);
        c0285q.V(-1672765850);
        Object K4 = c0285q.K();
        if (K4 == obj3) {
            K4 = new C0556f(c0551a);
            c0285q.e0(K4);
        }
        C0556f c0556f = (C0556f) K4;
        c0285q.r(false);
        c0285q.V(-1672765582);
        boolean g3 = c0285q.g(c0551a);
        Object obj4 = abstractActivityC0489m.f7008o;
        boolean g4 = c0285q.g(obj4) | g3 | c0285q.g(obj) | c0285q.g(c3) | c0285q.g(R3);
        Object K5 = c0285q.K();
        if (g4 || K5 == obj3) {
            Object c0000a = new C0000a(c0551a, obj4, obj, c3, R3, 3);
            c0285q.e0(c0000a);
            K5 = c0000a;
        }
        y2.c cVar2 = (y2.c) K5;
        c0285q.r(false);
        boolean g5 = c0285q.g(obj4) | c0285q.g(obj) | c0285q.g(c3);
        Object K6 = c0285q.K();
        if (g5 || K6 == obj3) {
            K6 = new G(cVar2);
            c0285q.e0(K6);
        }
        c0285q.r(false);
        return c0556f;
    }

    public static final S.h L(C0285q c0285q) {
        c0285q.U(-796080049);
        S.h hVar = (S.h) AbstractC0423a.Y(new Object[0], S.h.f5561d, null, S.i.f5565j, c0285q, 3072, 4);
        hVar.f5564c = (j) c0285q.l(l.f5571a);
        c0285q.r(false);
        return hVar;
    }

    public static final float M(long j3, float f3, O0.b bVar) {
        float c3;
        long b3 = m.b(j3);
        if (n.a(b3, 4294967296L)) {
            if (bVar.s() <= 1.05d) {
                return bVar.Q(j3);
            }
            c3 = m.c(j3) / m.c(bVar.g0(f3));
        } else {
            if (!n.a(b3, 8589934592L)) {
                return Float.NaN;
            }
            c3 = m.c(j3);
        }
        return c3 * f3;
    }

    public static final void N(Spannable spannable, long j3, int i2, int i3) {
        if (j3 != 16) {
            spannable.setSpan(new ForegroundColorSpan(AbstractC0571K.A(j3)), i2, i3, 33);
        }
    }

    public static final void O(Spannable spannable, long j3, O0.b bVar, int i2, int i3) {
        long b3 = m.b(j3);
        if (n.a(b3, 4294967296L)) {
            spannable.setSpan(new AbsoluteSizeSpan(B2.a.D(bVar.Q(j3)), false), i2, i3, 33);
        } else if (n.a(b3, 8589934592L)) {
            spannable.setSpan(new RelativeSizeSpan(m.c(j3)), i2, i3, 33);
        }
    }

    public static void P(EditorInfo editorInfo, String str) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            AbstractC0657a.a(editorInfo, str);
            return;
        }
        str.getClass();
        if (i2 >= 30) {
            AbstractC0657a.a(editorInfo, str);
            return;
        }
        int i3 = editorInfo.initialSelStart;
        int i4 = editorInfo.initialSelEnd;
        int i5 = i3 > i4 ? i4 : i3;
        if (i3 <= i4) {
            i3 = i4;
        }
        int length = str.length();
        if (i5 < 0 || i3 > length) {
            R(editorInfo, null, 0, 0);
            return;
        }
        int i6 = editorInfo.inputType & 4095;
        if (i6 == 129 || i6 == 225 || i6 == 18) {
            R(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            R(editorInfo, str, i5, i3);
            return;
        }
        int i7 = i3 - i5;
        int i8 = i7 > 1024 ? 0 : i7;
        int i9 = 2048 - i8;
        int min = Math.min(str.length() - i3, i9 - Math.min(i5, (int) (i9 * 0.8d)));
        int min2 = Math.min(i5, i9 - min);
        int i10 = i5 - min2;
        if (Character.isLowSurrogate(str.charAt(i10))) {
            i10++;
            min2--;
        }
        if (Character.isHighSurrogate(str.charAt((i3 + min) - 1))) {
            min--;
        }
        int i11 = min2 + i8;
        R(editorInfo, i8 != i7 ? TextUtils.concat(str.subSequence(i10, i10 + min2), str.subSequence(i3, min + i3)) : str.subSequence(i10, i11 + min + i10), min2, i11);
    }

    public static final void Q(Spannable spannable, Object obj, int i2, int i3) {
        spannable.setSpan(obj, i2, i3, 33);
    }

    public static void R(EditorInfo editorInfo, CharSequence charSequence, int i2, int i3) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i2);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i3);
    }

    public static final o S(X x2) {
        V.l lVar = V.l.f5857b;
        return !b0.a() ? lVar : V.a.b(lVar, new e0(0, x2));
    }

    public static final ExtractedText T(z zVar) {
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
        h.f(str2, "<this>");
        extractedText.flags = (H2.l.T(str2, '\n', 0, false, 2) >= 0 ? 1 : 0) ^ 1;
        return extractedText;
    }

    public static final long U(long j3) {
        return C.i((int) (j3 >> 32), (int) (j3 & 4294967295L));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final java.lang.String r109, final y2.c r110, final java.lang.String r111, V.o r112, J.C0285q r113, final int r114, final int r115) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.c.a(java.lang.String, y2.c, java.lang.String, V.o, J.q, int, int):void");
    }

    public static final C0911t b(float f3, long j3) {
        return new C0911t(f3, new C0578S(j3));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0099 A[EDGE_INSN: B:33:0x0099->B:34:0x0099 BREAK  A[LOOP:0: B:22:0x0071->B:31:0x0071], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(java.lang.String r28, V.o r29, J.C0285q r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 419
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.c.c(java.lang.String, V.o, J.q, int, int):void");
    }

    public static final O0.d d(Context context) {
        float f3 = context.getResources().getConfiguration().fontScale;
        float f4 = context.getResources().getDisplayMetrics().density;
        P0.a a3 = P0.b.a(f3);
        if (a3 == null) {
            a3 = new O0.l(f3);
        }
        return new O0.d(f4, f3, a3);
    }

    public static final long e(int i2, int i3) {
        return (i3 & 4294967295L) | (i2 << 32);
    }

    public static C0019b f(String str, K k3, long j3, O0.b bVar, H0.d dVar, C0970v c0970v, int i2, int i3) {
        int i4 = i3 & 32;
        C0970v c0970v2 = C0970v.f9165h;
        return new C0019b(new K0.d(str, k3, i4 != 0 ? c0970v2 : c0970v, c0970v2, dVar, bVar), i2, false, j3);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(java.lang.String r28, V.o r29, J.C0285q r30, int r31, int r32) {
        /*
            r7 = r28
            r2 = r30
            java.lang.String r0 = "title"
            z2.h.f(r7, r0)
            r0 = 598973948(0x23b39dfc, float:1.9474128E-17)
            r2.W(r0)
            r0 = r32 & 1
            if (r0 == 0) goto L16
            r0 = r31 | 6
            goto L28
        L16:
            r0 = r31 & 14
            if (r0 != 0) goto L26
            boolean r0 = r2.g(r7)
            if (r0 == 0) goto L22
            r0 = 4
            goto L23
        L22:
            r0 = 2
        L23:
            r0 = r31 | r0
            goto L28
        L26:
            r0 = r31
        L28:
            r1 = r32 & 2
            if (r1 == 0) goto L31
            r0 = r0 | 48
        L2e:
            r3 = r29
            goto L43
        L31:
            r3 = r31 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L2e
            r3 = r29
            boolean r4 = r2.g(r3)
            if (r4 == 0) goto L40
            r4 = 32
            goto L42
        L40:
            r4 = 16
        L42:
            r0 = r0 | r4
        L43:
            r4 = r0 & 91
            r5 = 18
            if (r4 != r5) goto L55
            boolean r4 = r30.A()
            if (r4 != 0) goto L50
            goto L55
        L50:
            r30.P()
            r2 = r3
            goto Laf
        L55:
            if (r1 == 0) goto L5a
            V.l r1 = V.l.f5857b
            r3 = r1
        L5a:
            J.X0 r1 = H.P5.f1917a
            java.lang.Object r1 = r2.l(r1)
            H.O5 r1 = (H.O5) r1
            C0.K r15 = r1.f1861h
            H0.k r20 = H0.k.f3403l
            J.X0 r1 = H.AbstractC0107g0.f2597a
            java.lang.Object r1 = r2.l(r1)
            H.e0 r1 = (H.C0093e0) r1
            long r13 = r1.q
            r1 = 12
            float r1 = (float) r1
            r4 = 0
            r5 = 1
            V.o r1 = androidx.compose.foundation.layout.a.k(r3, r4, r1, r5)
            r4 = 196608(0x30000, float:2.75506E-40)
            r0 = r0 & 14
            r22 = r0 | r4
            r18 = 0
            r19 = 0
            r4 = 0
            r6 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r16 = 0
            r25 = r13
            r13 = r16
            r0 = 0
            r21 = r15
            r15 = r0
            r16 = 0
            r17 = 0
            r23 = 0
            r24 = 65496(0xffd8, float:9.178E-41)
            r0 = r28
            r27 = r3
            r2 = r25
            r7 = r20
            r20 = r21
            r21 = r30
            H.t5.b(r0, r1, r2, r4, r6, r7, r8, r9, r11, r12, r13, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r2 = r27
        Laf:
            J.t0 r6 = r30.t()
            if (r6 == 0) goto Lc4
            X1.b r7 = new X1.b
            r5 = 0
            r0 = r7
            r1 = r28
            r3 = r31
            r4 = r32
            r0.<init>(r1, r2, r3, r4, r5)
            r6.f4235d = r7
        Lc4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.c.g(java.lang.String, V.o, J.q, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(final java.lang.String r22, final java.lang.String r23, final i0.C0712e r24, V.o r25, long r26, long r28, J.C0285q r30, final int r31, final int r32) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.c.h(java.lang.String, java.lang.String, i0.e, V.o, long, long, J.q, int, int):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007a, code lost:
    
        if (r3.equals("sent") != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0086, code lost:
    
        r20.U(1743986516);
        r20.r(false);
        r3 = e2.AbstractC0658a.f7563c;
        r3 = new m2.C0865g(new c0.C0603v(r3), new c0.C0603v(c0.C0603v.b(0.1f, r3)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0083, code lost:
    
        if (r3.equals("delivered") == false) goto L49;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void i(java.lang.String r18, V.o r19, J.C0285q r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.c.i(java.lang.String, V.o, J.q, int, int):void");
    }

    public static final C0048q j(S s3, InterfaceC0042k interfaceC0042k) {
        boolean z3 = s3.f() == 1;
        C0046o c0046o = (C0046o) s3.f764d;
        return new C0048q(n(c0046o, z3, true, interfaceC0042k), n(c0046o, z3, false, interfaceC0042k), z3);
    }

    public static final ExecutorService k(boolean z3) {
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new ThreadFactoryC0012b(z3));
        h.e(newFixedThreadPool, "newFixedThreadPool(\n    …)),\n        factory\n    )");
        return newFixedThreadPool;
    }

    public static final C0047p l(S s3, C0046o c0046o, C0047p c0047p) {
        int i2 = 0;
        boolean z3 = s3.f762b;
        int i3 = z3 ? c0046o.f872b : c0046o.f873c;
        c0046o.getClass();
        EnumC0863e enumC0863e = EnumC0863e.f8644i;
        InterfaceC0862d x2 = B2.a.x(enumC0863e, new C0050t(i3, i2, c0046o));
        int i4 = c0046o.f872b;
        int i5 = c0046o.f873c;
        InterfaceC0862d x3 = B2.a.x(enumC0863e, new C0049s(c0046o, i3, z3 ? i5 : i4, s3, x2));
        if (1 != c0047p.f878c) {
            return (C0047p) x3.getValue();
        }
        int i6 = c0046o.f874d;
        if (i3 == i6) {
            return c0047p;
        }
        H h2 = (H) c0046o.f875e;
        if (((Number) x2.getValue()).intValue() != h2.e(i6)) {
            return (C0047p) x3.getValue();
        }
        int i7 = c0047p.f877b;
        long k3 = h2.k(i7);
        if (i6 != -1) {
            if (i3 != i6) {
                if (i4 >= i5 && i4 > i5) {
                    i2 = 1;
                }
                if (((z3 ? 1 : 0) ^ i2) == 0) {
                }
            }
            return c0046o.a(i3);
        }
        int i8 = J.f472c;
        return (i7 == ((int) (k3 >> 32)) || i7 == ((int) (4294967295L & k3))) ? (C0047p) x3.getValue() : c0046o.a(i3);
    }

    public static final o m(o oVar, float f3) {
        return f3 == 1.0f ? oVar : androidx.compose.ui.graphics.a.b(oVar, 0.0f, 0.0f, f3, 0.0f, 0.0f, null, true, 126971);
    }

    public static final C0047p n(C0046o c0046o, boolean z3, boolean z4, InterfaceC0042k interfaceC0042k) {
        long j3;
        int i2 = z4 ? c0046o.f872b : c0046o.f873c;
        c0046o.getClass();
        long a3 = interfaceC0042k.a(c0046o, i2);
        if (z3 ^ z4) {
            int i3 = J.f472c;
            j3 = a3 >> 32;
        } else {
            int i4 = J.f472c;
            j3 = 4294967295L & a3;
        }
        return c0046o.a((int) j3);
    }

    public static final U2.g o(String str, C c3, U2.f[] fVarArr, y2.c cVar) {
        h.f(str, "serialName");
        h.f(cVar, "builder");
        if (!(!H2.l.V(str))) {
            throw new IllegalArgumentException("Blank serial names are prohibited".toString());
        }
        if (!(!h.a(c3, U2.j.f5825f))) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead".toString());
        }
        U2.a aVar = new U2.a(str);
        cVar.l(aVar);
        return new U2.g(str, c3, aVar.f5793b.size(), AbstractC0959k.A(fVarArr), aVar);
    }

    public static final C0047p p(C0047p c0047p, C0046o c0046o, int i2) {
        return new C0047p(((H) c0046o.f875e).a(i2), i2, c0047p.f878c);
    }

    public static final void q(int i2, int i3) {
        if (i2 < 0 || i2 >= i3) {
            throw new IndexOutOfBoundsException(AbstractC1265x.d(i2, i3, "index: ", ", size: "));
        }
    }

    public static void r(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static final void s(int i2, int i3) {
        if (i2 < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException(AbstractC1265x.d(i2, i3, "index: ", ", size: "));
        }
    }

    public static final void t(int i2, int i3, int i4) {
        if (i2 >= 0 && i3 <= i4) {
            if (i2 > i3) {
                throw new IllegalArgumentException(AbstractC1265x.d(i2, i3, "fromIndex: ", " > toIndex: "));
            }
            return;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i2 + ", toIndex: " + i3 + ", size: " + i4);
    }

    public static final void u(C0709b c0709b, C0731x c0731x) {
        int size = c0731x.q.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC0733z abstractC0733z = (AbstractC0733z) c0731x.q.get(i2);
            if (abstractC0733z instanceof C0707B) {
                C0714g c0714g = new C0714g();
                C0707B c0707b = (C0707B) abstractC0733z;
                c0714g.f7886d = c0707b.f7814i;
                c0714g.f7896n = true;
                c0714g.c();
                c0714g.f7900s.f(c0707b.f7815j);
                c0714g.c();
                c0714g.c();
                c0714g.f7884b = c0707b.f7816k;
                c0714g.c();
                c0714g.f7885c = c0707b.f7817l;
                c0714g.c();
                c0714g.f7889g = c0707b.f7818m;
                c0714g.c();
                c0714g.f7887e = c0707b.f7819n;
                c0714g.c();
                c0714g.f7888f = c0707b.f7820o;
                c0714g.f7897o = true;
                c0714g.c();
                c0714g.f7890h = c0707b.f7821p;
                c0714g.f7897o = true;
                c0714g.c();
                c0714g.f7891i = c0707b.q;
                c0714g.f7897o = true;
                c0714g.c();
                c0714g.f7892j = c0707b.f7822r;
                c0714g.f7897o = true;
                c0714g.c();
                c0714g.f7893k = c0707b.f7823s;
                c0714g.f7898p = true;
                c0714g.c();
                c0714g.f7894l = c0707b.f7824t;
                c0714g.f7898p = true;
                c0714g.c();
                c0714g.f7895m = c0707b.f7825u;
                c0714g.f7898p = true;
                c0714g.c();
                c0709b.e(i2, c0714g);
            } else if (abstractC0733z instanceof C0731x) {
                C0709b c0709b2 = new C0709b();
                C0731x c0731x2 = (C0731x) abstractC0733z;
                c0709b2.f7840k = c0731x2.f7949h;
                c0709b2.c();
                c0709b2.f7841l = c0731x2.f7950i;
                c0709b2.f7847s = true;
                c0709b2.c();
                c0709b2.f7844o = c0731x2.f7953l;
                c0709b2.f7847s = true;
                c0709b2.c();
                c0709b2.f7845p = c0731x2.f7954m;
                c0709b2.f7847s = true;
                c0709b2.c();
                c0709b2.q = c0731x2.f7955n;
                c0709b2.f7847s = true;
                c0709b2.c();
                c0709b2.f7846r = c0731x2.f7956o;
                c0709b2.f7847s = true;
                c0709b2.c();
                c0709b2.f7842m = c0731x2.f7951j;
                c0709b2.f7847s = true;
                c0709b2.c();
                c0709b2.f7843n = c0731x2.f7952k;
                c0709b2.f7847s = true;
                c0709b2.c();
                c0709b2.f7835f = c0731x2.f7957p;
                c0709b2.f7836g = true;
                c0709b2.c();
                u(c0709b2, c0731x2);
                c0709b.e(i2, c0709b2);
            }
        }
    }

    public static String v(String str) {
        return str != null ? "android-app://androidx.navigation/".concat(str) : "";
    }

    public static androidx.lifecycle.X w(Class cls) {
        try {
            Object newInstance = cls.getDeclaredConstructor(null).newInstance(null);
            h.e(newInstance, "{\n            modelClass…).newInstance()\n        }");
            return (androidx.lifecycle.X) newInstance;
        } catch (IllegalAccessException e3) {
            throw new RuntimeException("Cannot create an instance of " + cls, e3);
        } catch (InstantiationException e4) {
            throw new RuntimeException("Cannot create an instance of " + cls, e4);
        } catch (NoSuchMethodException e5) {
            throw new RuntimeException("Cannot create an instance of " + cls, e5);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:
    
        if (((C0.H) r0.f875e).f461a.f451a.f500a.length() != r1.f877b) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
    
        if (r1.f877b == r4.f877b) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final D.C0048q x(D.C0048q r9, D.S r10) {
        /*
            java.lang.Object r0 = r10.f764d
            D.o r0 = (D.C0046o) r0
            if (r9 != 0) goto L7
            goto L3c
        L7:
            D.p r1 = r9.f879a
            long r2 = r1.f878c
            D.p r4 = r9.f880b
            long r5 = r4.f878c
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 != 0) goto L1a
            int r1 = r1.f877b
            int r2 = r4.f877b
            if (r1 != r2) goto L3b
            goto L3c
        L1a:
            boolean r2 = r9.f881c
            if (r2 == 0) goto L20
            r3 = r1
            goto L21
        L20:
            r3 = r4
        L21:
            int r3 = r3.f877b
            if (r3 == 0) goto L26
            goto L3b
        L26:
            if (r2 == 0) goto L29
            r1 = r4
        L29:
            java.lang.Object r2 = r0.f875e
            C0.H r2 = (C0.H) r2
            C0.G r2 = r2.f461a
            C0.g r2 = r2.f451a
            java.lang.String r2 = r2.f500a
            int r2 = r2.length()
            int r1 = r1.f877b
            if (r2 == r1) goto L3c
        L3b:
            return r9
        L3c:
            java.lang.Object r1 = r0.f875e
            C0.H r1 = (C0.H) r1
            C0.G r1 = r1.f461a
            C0.g r1 = r1.f451a
            java.lang.String r1 = r1.f500a
            java.lang.Object r2 = r10.f763c
            D.q r2 = (D.C0048q) r2
            if (r2 == 0) goto Lcf
            int r1 = r1.length()
            if (r1 != 0) goto L54
            goto Lcf
        L54:
            java.lang.Object r1 = r0.f875e
            C0.H r1 = (C0.H) r1
            C0.G r1 = r1.f461a
            C0.g r1 = r1.f451a
            java.lang.String r1 = r1.f500a
            int r3 = r1.length()
            r4 = 2
            r5 = 0
            r6 = 1
            r7 = 0
            boolean r10 = r10.f762b
            int r8 = r0.f872b
            if (r8 != 0) goto L88
            int r1 = z.N.m(r1, r5)
            if (r10 == 0) goto L7d
            D.p r10 = r9.f879a
            D.p r10 = p(r10, r0, r1)
            D.q r9 = D.C0048q.a(r9, r10, r7, r6, r4)
            goto Lcf
        L7d:
            D.p r10 = r9.f880b
            D.p r10 = p(r10, r0, r1)
            D.q r9 = D.C0048q.a(r9, r7, r10, r5, r6)
            goto Lcf
        L88:
            if (r8 != r3) goto La6
            int r1 = z.N.p(r1, r3)
            if (r10 == 0) goto L9b
            D.p r10 = r9.f879a
            D.p r10 = p(r10, r0, r1)
            D.q r9 = D.C0048q.a(r9, r10, r7, r5, r4)
            goto Lcf
        L9b:
            D.p r10 = r9.f880b
            D.p r10 = p(r10, r0, r1)
            D.q r9 = D.C0048q.a(r9, r7, r10, r6, r6)
            goto Lcf
        La6:
            boolean r2 = r2.f881c
            if (r2 != r6) goto Lab
            r5 = r6
        Lab:
            r2 = r10 ^ r5
            if (r2 == 0) goto Lb4
            int r1 = z.N.p(r1, r8)
            goto Lb8
        Lb4:
            int r1 = z.N.m(r1, r8)
        Lb8:
            if (r10 == 0) goto Lc5
            D.p r10 = r9.f879a
            D.p r10 = p(r10, r0, r1)
            D.q r9 = D.C0048q.a(r9, r10, r7, r5, r4)
            goto Lcf
        Lc5:
            D.p r10 = r9.f880b
            D.p r10 = p(r10, r0, r1)
            D.q r9 = D.C0048q.a(r9, r7, r10, r5, r6)
        Lcf:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.c.x(D.q, D.S):D.q");
    }

    public static final int y(k kVar, int i2) {
        boolean z3 = h.g(kVar.f3405h, k.f3400i.f3405h) >= 0;
        boolean a3 = H0.i.a(i2, 1);
        if (a3 && z3) {
            return 3;
        }
        if (z3) {
            return 1;
        }
        return a3 ? 2 : 0;
    }

    public static final C0712e z() {
        C0712e c0712e = f8279a;
        if (c0712e != null) {
            return c0712e;
        }
        C0711d c0711d = new C0711d("Filled.CheckCircle", false);
        int i2 = AbstractC0732y.f7958a;
        C0578S c0578s = new C0578S(C0603v.f7272b);
        V0 v0 = new V0(1);
        v0.h(12.0f, 2.0f);
        v0.b(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        v0.j(4.48f, 10.0f, 10.0f, 10.0f);
        v0.j(10.0f, -4.48f, 10.0f, -10.0f);
        v0.i(17.52f, 2.0f, 12.0f, 2.0f);
        v0.a();
        v0.h(10.0f, 17.0f);
        v0.g(-5.0f, -5.0f);
        v0.g(1.41f, -1.41f);
        v0.f(10.0f, 14.17f);
        v0.g(7.59f, -7.59f);
        v0.f(19.0f, 8.0f);
        v0.g(-9.0f, 9.0f);
        v0.a();
        C0711d.a(c0711d, v0.f4104h, c0578s);
        C0712e b3 = c0711d.b();
        f8279a = b3;
        return b3;
    }

    public abstract void H(Throwable th);

    public abstract void I(K1.i iVar);
}
