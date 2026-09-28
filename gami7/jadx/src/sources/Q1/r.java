package Q1;

import B.F;
import B.y;
import O2.v;
import android.net.Uri;
import android.os.Handler;
import android.os.LocaleList;
import android.text.TextPaint;
import android.util.SparseArray;
import android.view.View;
import androidx.lifecycle.C0472v;
import androidx.lifecycle.EnumC0465n;
import androidx.lifecycle.InterfaceC0470t;
import androidx.lifecycle.W;
import g1.C0682d;
import g1.InterfaceC0685g;
import g1.s;
import g1.t;
import h1.C0697a;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import m2.EnumC0863e;
import s.AbstractC1166e;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5321a;

    /* renamed from: b, reason: collision with root package name */
    public Object f5322b;

    /* renamed from: c, reason: collision with root package name */
    public Object f5323c;

    /* renamed from: d, reason: collision with root package name */
    public Object f5324d;

    public /* synthetic */ r(Object obj, Object obj2, Object obj3, int i2) {
        this.f5321a = i2;
        this.f5322b = obj;
        this.f5323c = obj2;
        this.f5324d = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(long r8, long r10, q2.InterfaceC1073d r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof m0.C0854b
            if (r0 == 0) goto L14
            r0 = r12
            m0.b r0 = (m0.C0854b) r0
            int r1 = r0.f8616m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f8616m = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            m0.b r0 = new m0.b
            r0.<init>(r7, r12)
            goto L12
        L1a:
            java.lang.Object r12 = r6.f8614k
            r2.a r0 = r2.EnumC1145a.f10026h
            int r1 = r6.f8616m
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            C1.y.J(r12)
            goto L53
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L31:
            C1.y.J(r12)
            java.lang.Object r12 = r7.f5322b
            m0.f r12 = (m0.f) r12
            r1 = 0
            if (r12 == 0) goto L46
            boolean r3 = r12.f5869t
            if (r3 == 0) goto L46
            t0.p0 r12 = t0.AbstractC1248f.k(r12)
            r1 = r12
            m0.f r1 = (m0.f) r1
        L46:
            if (r1 == 0) goto L58
            r6.f8616m = r2
            r2 = r8
            r4 = r10
            java.lang.Object r12 = r1.L(r2, r4, r6)
            if (r12 != r0) goto L53
            return r0
        L53:
            O0.o r12 = (O0.o) r12
            long r8 = r12.f5156a
            goto L5a
        L58:
            r8 = 0
        L5a:
            O0.o r10 = new O0.o
            r10.<init>(r8)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: Q1.r.a(long, long, q2.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(long r6, q2.InterfaceC1073d r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof m0.c
            if (r0 == 0) goto L13
            r0 = r8
            m0.c r0 = (m0.c) r0
            int r1 = r0.f8619m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8619m = r1
            goto L18
        L13:
            m0.c r0 = new m0.c
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f8617k
            r2.a r1 = r2.EnumC1145a.f10026h
            int r2 = r0.f8619m
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            C1.y.J(r8)
            goto L4f
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            C1.y.J(r8)
            java.lang.Object r8 = r5.f5322b
            m0.f r8 = (m0.f) r8
            r2 = 0
            if (r8 == 0) goto L44
            boolean r4 = r8.f5869t
            if (r4 == 0) goto L44
            t0.p0 r8 = t0.AbstractC1248f.k(r8)
            r2 = r8
            m0.f r2 = (m0.f) r2
        L44:
            if (r2 == 0) goto L54
            r0.f8619m = r3
            java.lang.Object r8 = r2.T(r6, r0)
            if (r8 != r1) goto L4f
            return r1
        L4f:
            O0.o r8 = (O0.o) r8
            long r6 = r8.f5156a
            goto L56
        L54:
            r6 = 0
        L56:
            O0.o r8 = new O0.o
            r8.<init>(r6)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: Q1.r.b(long, q2.d):java.lang.Object");
    }

    public J0.b c() {
        LocaleList localeList = LocaleList.getDefault();
        synchronized (((C1.b) this.f5324d)) {
            try {
                J0.b bVar = (J0.b) this.f5323c;
                if (bVar != null && localeList == ((LocaleList) this.f5322b)) {
                    return bVar;
                }
                int size = localeList.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i2 = 0; i2 < size; i2++) {
                    arrayList.add(new J0.a(localeList.get(i2)));
                }
                J0.b bVar2 = new J0.b(arrayList);
                this.f5322b = localeList;
                this.f5323c = bVar2;
                return bVar2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean d(CharSequence charSequence, int i2, int i3, t tVar) {
        if ((tVar.f7761c & 3) == 0) {
            InterfaceC0685g interfaceC0685g = (InterfaceC0685g) this.f5324d;
            C0697a c3 = tVar.c();
            int a3 = c3.a(8);
            if (a3 != 0) {
                ((ByteBuffer) c3.f7787k).getShort(a3 + c3.f7784h);
            }
            C0682d c0682d = (C0682d) interfaceC0685g;
            c0682d.getClass();
            ThreadLocal threadLocal = C0682d.f7712b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i2 < i3) {
                sb.append(charSequence.charAt(i2));
                i2++;
            }
            TextPaint textPaint = c0682d.f7713a;
            String sb2 = sb.toString();
            int i4 = W0.d.f5895a;
            boolean a4 = W0.c.a(textPaint, sb2);
            int i5 = tVar.f7761c & 4;
            tVar.f7761c = a4 ? i5 | 2 : i5 | 1;
        }
        return (tVar.f7761c & 3) == 2;
    }

    public void e(EnumC0465n enumC0465n) {
        W w2 = (W) this.f5324d;
        if (w2 != null) {
            w2.run();
        }
        W w3 = new W((C0472v) this.f5322b, enumC0465n);
        this.f5324d = w3;
        ((Handler) this.f5323c).postAtFrontOfQueue(w3);
    }

    public Object f(CharSequence charSequence, int i2, int i3, int i4, boolean z3, g1.n nVar) {
        char c3;
        s sVar = null;
        g1.p pVar = new g1.p((s) ((K1.i) this.f5323c).f4549k, false, null);
        int codePointAt = Character.codePointAt(charSequence, i2);
        int i5 = 0;
        boolean z4 = true;
        int i6 = i2;
        int i7 = i6;
        while (i6 < i3 && i5 < i4 && z4) {
            SparseArray sparseArray = ((s) pVar.f7741f).f7756a;
            s sVar2 = sparseArray == null ? sVar : (s) sparseArray.get(codePointAt);
            if (pVar.f7737b == 2) {
                if (sVar2 != null) {
                    pVar.f7741f = sVar2;
                    pVar.f7739d++;
                } else {
                    if (codePointAt == 65038) {
                        pVar.c();
                    } else if (codePointAt != 65039) {
                        s sVar3 = (s) pVar.f7741f;
                        if (sVar3.f7757b != null) {
                            if (pVar.f7739d != 1) {
                                pVar.f7742g = sVar3;
                                pVar.c();
                            } else if (pVar.d()) {
                                pVar.f7742g = (s) pVar.f7741f;
                                pVar.c();
                            } else {
                                pVar.c();
                            }
                            c3 = 3;
                        } else {
                            pVar.c();
                        }
                    }
                    c3 = 1;
                }
                c3 = 2;
            } else if (sVar2 == null) {
                pVar.c();
                c3 = 1;
            } else {
                pVar.f7737b = 2;
                pVar.f7741f = sVar2;
                pVar.f7739d = 1;
                c3 = 2;
            }
            pVar.f7738c = codePointAt;
            if (c3 != 1) {
                if (c3 == 2) {
                    int charCount = Character.charCount(codePointAt) + i6;
                    if (charCount < i3) {
                        codePointAt = Character.codePointAt(charSequence, charCount);
                    }
                    i6 = charCount;
                } else if (c3 == 3) {
                    if (z3 || !d(charSequence, i7, i6, ((s) pVar.f7742g).f7757b)) {
                        z4 = nVar.c(charSequence, i7, i6, ((s) pVar.f7742g).f7757b);
                        i5++;
                    }
                }
                sVar = null;
            } else {
                i6 = Character.charCount(Character.codePointAt(charSequence, i7)) + i7;
                if (i6 < i3) {
                    codePointAt = Character.codePointAt(charSequence, i6);
                }
            }
            i7 = i6;
            sVar = null;
        }
        if (pVar.f7737b == 2 && ((s) pVar.f7741f).f7757b != null && ((pVar.f7739d > 1 || pVar.d()) && i5 < i4 && z4 && (z3 || !d(charSequence, i7, i6, ((s) pVar.f7741f).f7757b)))) {
            nVar.c(charSequence, i7, i6, ((s) pVar.f7741f).f7757b);
        }
        return nVar.a();
    }

    public String toString() {
        switch (this.f5321a) {
            case 7:
                StringBuilder sb = new StringBuilder("NavDeepLinkRequest{");
                Uri uri = (Uri) this.f5322b;
                if (uri != null) {
                    sb.append(" uri=");
                    sb.append(String.valueOf(uri));
                }
                String str = (String) this.f5323c;
                if (str != null) {
                    sb.append(" action=");
                    sb.append(str);
                }
                String str2 = (String) this.f5324d;
                if (str2 != null) {
                    sb.append(" mimetype=");
                    sb.append(str2);
                }
                sb.append(" }");
                String sb2 = sb.toString();
                z2.h.e(sb2, "sb.toString()");
                return sb2;
            default:
                return super.toString();
        }
    }

    public r(InterfaceC0470t interfaceC0470t) {
        this.f5321a = 4;
        z2.h.f(interfaceC0470t, "provider");
        this.f5322b = new C0472v(interfaceC0470t);
        this.f5323c = new Handler();
    }

    public r(r1.r rVar) {
        this.f5321a = 0;
        this.f5322b = rVar;
        this.f5323c = new K1.b(rVar, 9);
        this.f5324d = new K1.p(rVar, 4);
        new K1.p(rVar, 5);
    }

    public r(int i2) {
        this.f5321a = i2;
        switch (i2) {
            case 3:
                this.f5322b = new WeakHashMap();
                this.f5323c = new WeakHashMap();
                this.f5324d = new WeakHashMap();
                break;
            case AbstractC1166e.f10136d /* 6 */:
                this.f5323c = new y(26, this);
                break;
            default:
                this.f5324d = new C1.b(6, false);
                break;
        }
    }

    public r(View view) {
        this.f5321a = 1;
        this.f5322b = view;
        this.f5323c = B2.a.x(EnumC0863e.f8644i, new y(11, this));
        this.f5324d = new F(view);
    }

    public r(K1.i iVar, C1.b bVar, C0682d c0682d, Set set) {
        this.f5321a = 5;
        this.f5322b = bVar;
        this.f5323c = iVar;
        this.f5324d = c0682d;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            f(str, 0, str.length(), 1, true, new v(str, 1));
        }
    }
}
