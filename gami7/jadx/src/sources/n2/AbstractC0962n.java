package n2;

import H.C0157n1;
import H.S3;
import J.C0285q;
import J.C0291t0;
import android.database.Cursor;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import c1.C0615h;
import com.example.bulksmsscheduler.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import n0.AbstractC0937p;
import n0.C0925d;
import o0.C0991a;
import o0.C0992b;
import o2.C0996b;
import p.X;
import r0.AbstractC1108W;
import t0.Z;

/* renamed from: n2.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0962n {
    public static final void a(v.x xVar, Object obj, int i2, Object obj2, C0285q c0285q, int i3) {
        int i4;
        c0285q.W(1439843069);
        if ((i3 & 6) == 0) {
            i4 = (c0285q.g(xVar) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= c0285q.g(obj) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= c0285q.e(i2) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= c0285q.g(obj2) ? 2048 : 1024;
        }
        if ((i4 & 1171) == 1170 && c0285q.A()) {
            c0285q.P();
        } else {
            ((S.c) obj).a(obj2, R.b.c(980966366, new C0157n1(i2, obj2, xVar), c0285q), c0285q, 48);
        }
        C0291t0 t3 = c0285q.t();
        if (t3 != null) {
            t3.f4235d = new S3(xVar, obj, i2, obj2, i3);
        }
    }

    public static final boolean b(Object[] objArr, int i2, int i3, List list) {
        if (i3 != list.size()) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!z2.h.a(objArr[i2 + i4], list.get(i4))) {
                return false;
            }
        }
        return true;
    }

    public static final String c(Object[] objArr, int i2, int i3, Collection collection) {
        StringBuilder sb = new StringBuilder((i3 * 3) + 2);
        sb.append("[");
        for (int i4 = 0; i4 < i3; i4++) {
            if (i4 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i2 + i4];
            if (obj == collection) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        String sb2 = sb.toString();
        z2.h.e(sb2, "toString(...)");
        return sb2;
    }

    public static final void d(C0992b c0992b, n0.r rVar) {
        if (AbstractC0937p.a(rVar)) {
            g1.p pVar = c0992b.f9228a;
            C0991a[] c0991aArr = (C0991a[]) pVar.f7740e;
            AbstractC0959k.u(c0991aArr, null, 0, c0991aArr.length);
            pVar.f7739d = 0;
            g1.p pVar2 = c0992b.f9229b;
            C0991a[] c0991aArr2 = (C0991a[]) pVar2.f7740e;
            AbstractC0959k.u(c0991aArr2, null, 0, c0991aArr2.length);
            pVar2.f7739d = 0;
            c0992b.f9230c = 0L;
        }
        boolean c3 = AbstractC0937p.c(rVar);
        long j3 = rVar.f8958b;
        if (!c3) {
            List list = rVar.f8967k;
            if (list == null) {
                list = C0970v.f9165h;
            }
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0925d c0925d = (C0925d) list.get(i2);
                long j4 = c0925d.f8924a;
                long j5 = c0925d.f8926c;
                c0992b.f9228a.a(b0.c.d(j5), j4);
                c0992b.f9229b.a(b0.c.e(j5), j4);
            }
            long j6 = rVar.f8968l;
            c0992b.f9228a.a(b0.c.d(j6), j3);
            c0992b.f9229b.a(b0.c.e(j6), j3);
        }
        if (AbstractC0937p.c(rVar) && j3 - c0992b.f9230c > 40) {
            g1.p pVar3 = c0992b.f9228a;
            C0991a[] c0991aArr3 = (C0991a[]) pVar3.f7740e;
            AbstractC0959k.u(c0991aArr3, null, 0, c0991aArr3.length);
            pVar3.f7739d = 0;
            g1.p pVar4 = c0992b.f9229b;
            C0991a[] c0991aArr4 = (C0991a[]) pVar4.f7740e;
            AbstractC0959k.u(c0991aArr4, null, 0, c0991aArr4.length);
            pVar4.f7739d = 0;
            c0992b.f9230c = 0L;
        }
        c0992b.f9230c = j3;
    }

    public static C0996b e(C0996b c0996b) {
        c0996b.h();
        c0996b.f9334j = true;
        return c0996b.f9333i > 0 ? c0996b : C0996b.f9331k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [n2.v] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.ArrayList] */
    public static final boolean f(ArrayList arrayList) {
        ?? r02;
        long j3;
        if (arrayList.size() < 2) {
            return true;
        }
        if (arrayList.size() == 0 || arrayList.size() == 1) {
            r02 = C0970v.f9165h;
        } else {
            r02 = new ArrayList();
            Object obj = arrayList.get(0);
            int u3 = AbstractC0963o.u(arrayList);
            int i2 = 0;
            while (i2 < u3) {
                i2++;
                Object obj2 = arrayList.get(i2);
                A0.q qVar = (A0.q) obj2;
                A0.q qVar2 = (A0.q) obj;
                r02.add(new b0.c(K1.f.e(Math.abs(b0.c.d(qVar2.e().b()) - b0.c.d(qVar.e().b())), Math.abs(b0.c.e(qVar2.e().b()) - b0.c.e(qVar.e().b())))));
                obj = obj2;
            }
        }
        if (r02.size() == 1) {
            j3 = ((b0.c) AbstractC0961m.G(r02)).f7058a;
        } else {
            if (r02.isEmpty()) {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            Object G3 = AbstractC0961m.G(r02);
            int u4 = AbstractC0963o.u(r02);
            if (1 <= u4) {
                int i3 = 1;
                while (true) {
                    G3 = new b0.c(b0.c.h(((b0.c) G3).f7058a, ((b0.c) r02.get(i3)).f7058a));
                    if (i3 == u4) {
                        break;
                    }
                    i3++;
                }
            }
            j3 = ((b0.c) G3).f7058a;
        }
        return b0.c.e(j3) < b0.c.d(j3);
    }

    public static final float g(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f3 = 0.0f;
        for (int i2 = 0; i2 < length; i2++) {
            f3 += fArr[i2] * fArr2[i2];
        }
        return f3;
    }

    public static final u1.f h(View view) {
        z2.h.f(view, "<this>");
        return (u1.f) G2.i.h0(G2.i.j0(G2.i.i0(view, u1.g.f11267j), u1.g.f11268k));
    }

    public static final int i(Cursor cursor, String str) {
        z2.h.f(cursor, "c");
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        int columnIndex2 = cursor.getColumnIndex("`" + str + '`');
        if (columnIndex2 >= 0) {
            return columnIndex2;
        }
        return -1;
    }

    public static final int j(Cursor cursor, String str) {
        String str2;
        z2.h.f(cursor, "c");
        int i2 = i(cursor, str);
        if (i2 >= 0) {
            return i2;
        }
        try {
            String[] columnNames = cursor.getColumnNames();
            z2.h.e(columnNames, "c.columnNames");
            str2 = AbstractC0959k.y(columnNames);
        } catch (Exception e3) {
            Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", e3);
            str2 = "unknown";
        }
        throw new IllegalArgumentException("column '" + str + "' does not exist. Available columns: " + str2);
    }

    public static String k(String str, String str2) {
        z2.h.f(str, "tableName");
        z2.h.f(str2, "triggerType");
        return "`room_table_modification_trigger_" + str + '_' + str2 + '`';
    }

    public static List l(Object obj) {
        List singletonList = Collections.singletonList(obj);
        z2.h.e(singletonList, "singletonList(...)");
        return singletonList;
    }

    public static final int m(u.q qVar, X x2) {
        return (int) (x2 == X.f9518h ? qVar.q & 4294967295L : qVar.q >> 32);
    }

    public static final void n(float[] fArr, float[] fArr2, int i2, float[] fArr3) {
        if (i2 == 0) {
            AbstractC0946A.q("At least one point must be provided");
            throw null;
        }
        int i3 = 2 >= i2 ? i2 - 1 : 2;
        int i4 = i3 + 1;
        float[][] fArr4 = new float[i4][];
        for (int i5 = 0; i5 < i4; i5++) {
            fArr4[i5] = new float[i2];
        }
        for (int i6 = 0; i6 < i2; i6++) {
            fArr4[0][i6] = 1.0f;
            for (int i7 = 1; i7 < i4; i7++) {
                fArr4[i7][i6] = fArr4[i7 - 1][i6] * fArr[i6];
            }
        }
        float[][] fArr5 = new float[i4][];
        for (int i8 = 0; i8 < i4; i8++) {
            fArr5[i8] = new float[i2];
        }
        float[][] fArr6 = new float[i4][];
        for (int i9 = 0; i9 < i4; i9++) {
            fArr6[i9] = new float[i4];
        }
        int i10 = 0;
        while (i10 < i4) {
            float[] fArr7 = fArr5[i10];
            float[] fArr8 = fArr4[i10];
            z2.h.f(fArr8, "<this>");
            z2.h.f(fArr7, "destination");
            System.arraycopy(fArr8, 0, fArr7, 0, i2);
            for (int i11 = 0; i11 < i10; i11++) {
                float[] fArr9 = fArr5[i11];
                float g3 = g(fArr7, fArr9);
                for (int i12 = 0; i12 < i2; i12++) {
                    fArr7[i12] = fArr7[i12] - (fArr9[i12] * g3);
                }
            }
            float sqrt = (float) Math.sqrt(g(fArr7, fArr7));
            if (sqrt < 1.0E-6f) {
                sqrt = 1.0E-6f;
            }
            float f3 = 1.0f / sqrt;
            for (int i13 = 0; i13 < i2; i13++) {
                fArr7[i13] = fArr7[i13] * f3;
            }
            float[] fArr10 = fArr6[i10];
            int i14 = 0;
            while (i14 < i4) {
                fArr10[i14] = i14 < i10 ? 0.0f : g(fArr7, fArr4[i14]);
                i14++;
            }
            i10++;
        }
        for (int i15 = i3; -1 < i15; i15--) {
            float g4 = g(fArr5[i15], fArr2);
            float[] fArr11 = fArr6[i15];
            int i16 = i15 + 1;
            if (i16 <= i3) {
                int i17 = i3;
                while (true) {
                    g4 -= fArr11[i17] * fArr3[i17];
                    if (i17 != i16) {
                        i17--;
                    }
                }
            }
            fArr3[i15] = g4 / fArr11[i15];
        }
    }

    public static final void o(Object[] objArr, int i2, int i3) {
        z2.h.f(objArr, "<this>");
        while (i2 < i3) {
            objArr[i2] = null;
            i2++;
        }
    }

    public static final void p(View view, u1.f fVar) {
        z2.h.f(view, "<this>");
        view.setTag(R.id.view_tree_saved_state_registry_owner, fVar);
    }

    public static final void q(C0615h c0615h, A0.q qVar) {
        A0.b bVar = (A0.b) B1.C.T(qVar.i(), A0.t.f100f);
        AccessibilityNodeInfo accessibilityNodeInfo = c0615h.f7299a;
        if (bVar != null) {
            accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(bVar.f18a, bVar.f19b, false, 0));
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (B1.C.T(qVar.i(), A0.t.f99e) != null) {
            List h2 = A0.q.h(qVar, true, 4);
            int size = h2.size();
            for (int i2 = 0; i2 < size; i2++) {
                A0.q qVar2 = (A0.q) h2.get(i2);
                if (qVar2.i().f60h.containsKey(A0.t.f90A)) {
                    arrayList.add(qVar2);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            boolean f3 = f(arrayList);
            accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(f3 ? 1 : arrayList.size(), f3 ? arrayList.size() : 1, false, 0));
        }
    }

    public static final void r(C0615h c0615h, A0.q qVar) {
        B1.t.w(B1.C.T(qVar.i(), A0.t.f101g));
        A0.q j3 = qVar.j();
        if (j3 == null || B1.C.T(j3.i(), A0.t.f99e) == null) {
            return;
        }
        A0.b bVar = (A0.b) B1.C.T(j3.i(), A0.t.f100f);
        if (bVar == null || (bVar.f18a >= 0 && bVar.f19b >= 0)) {
            if (qVar.i().f60h.containsKey(A0.t.f90A)) {
                ArrayList arrayList = new ArrayList();
                List h2 = A0.q.h(j3, true, 4);
                int size = h2.size();
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    A0.q qVar2 = (A0.q) h2.get(i3);
                    if (qVar2.i().f60h.containsKey(A0.t.f90A)) {
                        arrayList.add(qVar2);
                        if (qVar2.f71c.t() < qVar.f71c.t()) {
                            i2++;
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    boolean f3 = f(arrayList);
                    int i4 = f3 ? 0 : i2;
                    int i5 = f3 ? i2 : 0;
                    Object obj = qVar.i().f60h.get(A0.t.f90A);
                    if (obj == null) {
                        obj = Boolean.FALSE;
                    }
                    c0615h.f7299a.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i4, 1, i5, 1, false, ((Boolean) obj).booleanValue()));
                }
            }
        }
    }

    public static final void s(A0.q qVar, int i2, z0.i iVar) {
        L.d dVar = new L.d(new A0.q[16]);
        List g3 = qVar.g(false, false, false);
        while (true) {
            dVar.d(dVar.f4620j, g3);
            while (dVar.l()) {
                A0.q qVar2 = (A0.q) dVar.n(dVar.f4620j - 1);
                Z c3 = qVar2.c();
                if (c3 == null || !c3.a1()) {
                    A0.x xVar = A0.t.f107m;
                    A0.k kVar = qVar2.f72d;
                    if (kVar.f60h.containsKey(xVar)) {
                        continue;
                    } else {
                        A0.x xVar2 = A0.t.f103i;
                        LinkedHashMap linkedHashMap = kVar.f60h;
                        if (linkedHashMap.containsKey(xVar2)) {
                            continue;
                        } else {
                            Z c4 = qVar2.c();
                            if (c4 == null) {
                                AbstractC0946A.s("Expected semantics node to have a coordinator.");
                                throw null;
                            }
                            b0.d e3 = AbstractC1108W.e(c4);
                            int round = Math.round(e3.f7060a);
                            int round2 = Math.round(e3.f7061b);
                            int round3 = Math.round(e3.f7062c);
                            int round4 = Math.round(e3.f7063d);
                            O0.i iVar2 = new O0.i(round, round2, round3, round4);
                            if (round < round3 && round2 < round4) {
                                y2.e eVar = (y2.e) B1.C.T(kVar, A0.j.f39e);
                                Object obj = linkedHashMap.get(A0.t.f110p);
                                A0.i iVar3 = (A0.i) (obj != null ? obj : null);
                                if (eVar == null || iVar3 == null || ((Number) iVar3.f32b.c()).floatValue() <= 0.0f) {
                                    g3 = qVar2.g(false, false, false);
                                } else {
                                    int i3 = i2 + 1;
                                    iVar.l(new z0.k(qVar2, i3, iVar2, c4));
                                    s(qVar2, i3, iVar);
                                }
                            }
                        }
                    }
                }
            }
            return;
        }
    }
}
