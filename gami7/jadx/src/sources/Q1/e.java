package Q1;

import C0.AbstractC0025h;
import C0.C0022e;
import C0.C0024g;
import C0.K;
import C0.s;
import C0.t;
import D0.y;
import android.text.Layout;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.List;
import m2.EnumC0863e;
import m2.InterfaceC0862d;
import n2.AbstractC0960l;
import n2.AbstractC0963o;
import n2.C0970v;

/* loaded from: classes.dex */
public final class e implements s {

    /* renamed from: a, reason: collision with root package name */
    public final Object f5277a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f5278b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f5279c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f5280d;

    /* renamed from: e, reason: collision with root package name */
    public Object f5281e;

    public e(Layout layout) {
        this.f5277a = layout;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        do {
            int T3 = H2.l.T(((Layout) this.f5277a).getText(), '\n', i2, false, 4);
            i2 = T3 < 0 ? ((Layout) this.f5277a).getText().length() : T3 + 1;
            arrayList.add(Integer.valueOf(i2));
        } while (i2 < ((Layout) this.f5277a).getText().length());
        this.f5278b = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            arrayList2.add(null);
        }
        this.f5279c = arrayList2;
        this.f5280d = new boolean[((ArrayList) this.f5278b).size()];
        ((ArrayList) this.f5278b).size();
    }

    @Override // C0.s
    public float a() {
        return ((Number) ((InterfaceC0862d) this.f5279c).getValue()).floatValue();
    }

    @Override // C0.s
    public boolean b() {
        ArrayList arrayList = (ArrayList) this.f5281e;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((C0.r) arrayList.get(i2)).f540a.b()) {
                return true;
            }
        }
        return false;
    }

    @Override // C0.s
    public float c() {
        return ((Number) ((InterfaceC0862d) this.f5280d).getValue()).floatValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0076, code lost:
    
        if (r1.getRunCount() == 1) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.text.Bidi d(int r15) {
        /*
            r14 = this;
            java.lang.Object r0 = r14.f5280d
            boolean[] r0 = (boolean[]) r0
            boolean r1 = r0[r15]
            java.lang.Object r2 = r14.f5279c
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            if (r1 == 0) goto L13
            java.lang.Object r15 = r2.get(r15)
            java.text.Bidi r15 = (java.text.Bidi) r15
            return r15
        L13:
            java.lang.Object r1 = r14.f5278b
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            r3 = 0
            if (r15 != 0) goto L1c
            r4 = r3
            goto L28
        L1c:
            int r4 = r15 + (-1)
            java.lang.Object r4 = r1.get(r4)
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
        L28:
            java.lang.Object r1 = r1.get(r15)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            int r10 = r1 - r4
            java.lang.Object r5 = r14.f5281e
            char[] r5 = (char[]) r5
            if (r5 == 0) goto L40
            int r6 = r5.length
            if (r6 >= r10) goto L3e
            goto L40
        L3e:
            r12 = r5
            goto L43
        L40:
            char[] r5 = new char[r10]
            goto L3e
        L43:
            java.lang.Object r5 = r14.f5277a
            android.text.Layout r5 = (android.text.Layout) r5
            java.lang.CharSequence r6 = r5.getText()
            android.text.TextUtils.getChars(r6, r4, r1, r12, r3)
            boolean r1 = java.text.Bidi.requiresBidi(r12, r3, r10)
            r4 = 1
            r13 = 0
            if (r1 == 0) goto L78
            int r1 = r14.h(r15)
            int r1 = r5.getLineForOffset(r1)
            int r1 = r5.getParagraphDirection(r1)
            r5 = -1
            if (r1 != r5) goto L67
            r11 = r4
            goto L68
        L67:
            r11 = r3
        L68:
            java.text.Bidi r1 = new java.text.Bidi
            r9 = 0
            r7 = 0
            r8 = 0
            r5 = r1
            r6 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11)
            int r3 = r1.getRunCount()
            if (r3 != r4) goto L79
        L78:
            r1 = r13
        L79:
            r2.set(r15, r1)
            r0[r15] = r4
            if (r1 == 0) goto L89
            java.lang.Object r15 = r14.f5281e
            char[] r15 = (char[]) r15
            if (r12 != r15) goto L88
            r12 = r13
            goto L89
        L88:
            r12 = r15
        L89:
            r14.f5281e = r12
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Q1.e.d(int):java.text.Bidi");
    }

    public float e(int i2, boolean z3) {
        Layout layout = (Layout) this.f5277a;
        int lineEnd = layout.getLineEnd(layout.getLineForOffset(i2));
        if (i2 > lineEnd) {
            i2 = lineEnd;
        }
        return z3 ? layout.getPrimaryHorizontal(i2) : layout.getSecondaryHorizontal(i2);
    }

    public float f(int i2, boolean z3, boolean z4) {
        int i3;
        int i4;
        int i5 = i2;
        if (!z4) {
            return e(i2, z3);
        }
        Layout layout = (Layout) this.f5277a;
        int c3 = y.c(layout, i5, z4);
        int lineStart = layout.getLineStart(c3);
        int lineEnd = layout.getLineEnd(c3);
        if (i5 != lineStart && i5 != lineEnd) {
            return e(i2, z3);
        }
        if (i5 == 0 || i5 == layout.getText().length()) {
            return e(i2, z3);
        }
        int g3 = g(i5, z4);
        boolean z5 = layout.getParagraphDirection(layout.getLineForOffset(h(g3))) == -1;
        int i6 = i(lineEnd, lineStart);
        int h2 = h(g3);
        int i7 = lineStart - h2;
        int i8 = i6 - h2;
        Bidi d3 = d(g3);
        Bidi createLineBidi = d3 != null ? d3.createLineBidi(i7, i8) : null;
        if (createLineBidi == null || createLineBidi.getRunCount() == 1) {
            boolean z6 = (z3 || z5 == layout.isRtlCharAt(lineStart)) ? !z5 : z5;
            return (i5 != lineStart ? z6 : !z6) ? layout.getLineRight(c3) : layout.getLineLeft(c3);
        }
        int runCount = createLineBidi.getRunCount();
        D0.p[] pVarArr = new D0.p[runCount];
        for (int i9 = 0; i9 < runCount; i9++) {
            pVarArr[i9] = new D0.p(createLineBidi.getRunStart(i9) + lineStart, createLineBidi.getRunLimit(i9) + lineStart, createLineBidi.getRunLevel(i9) % 2 == 1);
        }
        int runCount2 = createLineBidi.getRunCount();
        byte[] bArr = new byte[runCount2];
        for (int i10 = 0; i10 < runCount2; i10++) {
            bArr[i10] = (byte) createLineBidi.getRunLevel(i10);
        }
        Bidi.reorderVisually(bArr, 0, pVarArr, 0, runCount);
        if (i5 == lineStart) {
            int i11 = 0;
            while (true) {
                if (i11 >= runCount) {
                    i4 = -1;
                    break;
                }
                if (pVarArr[i11].f977a == i5) {
                    i4 = i11;
                    break;
                }
                i11++;
            }
            boolean z7 = (z3 || z5 == pVarArr[i4].f979c) ? !z5 : z5;
            return (i4 == 0 && z7) ? layout.getLineLeft(c3) : (i4 != runCount - 1 || z7) ? z7 ? layout.getPrimaryHorizontal(pVarArr[i4 - 1].f977a) : layout.getPrimaryHorizontal(pVarArr[i4 + 1].f977a) : layout.getLineRight(c3);
        }
        if (i5 > i6) {
            i5 = i(i5, lineStart);
        }
        int i12 = 0;
        while (true) {
            if (i12 >= runCount) {
                i3 = -1;
                break;
            }
            if (pVarArr[i12].f978b == i5) {
                i3 = i12;
                break;
            }
            i12++;
        }
        boolean z8 = (z3 || z5 == pVarArr[i3].f979c) ? z5 : !z5;
        return (i3 == 0 && z8) ? layout.getLineLeft(c3) : (i3 != runCount - 1 || z8) ? z8 ? layout.getPrimaryHorizontal(pVarArr[i3 - 1].f978b) : layout.getPrimaryHorizontal(pVarArr[i3 + 1].f978b) : layout.getLineRight(c3);
    }

    public int g(int i2, boolean z3) {
        int i3;
        ArrayList arrayList = (ArrayList) this.f5278b;
        Integer valueOf = Integer.valueOf(i2);
        int size = arrayList.size();
        z2.h.f(arrayList, "<this>");
        int i4 = 0;
        AbstractC0963o.x(arrayList.size(), 0, size);
        int i5 = size - 1;
        while (true) {
            if (i4 > i5) {
                i3 = -(i4 + 1);
                break;
            }
            i3 = (i4 + i5) >>> 1;
            int g3 = AbstractC0960l.g((Comparable) arrayList.get(i3), valueOf);
            if (g3 >= 0) {
                if (g3 <= 0) {
                    break;
                }
                i5 = i3 - 1;
            } else {
                i4 = i3 + 1;
            }
        }
        int i6 = i3 < 0 ? -(i3 + 1) : i3 + 1;
        if (z3 && i6 > 0) {
            int i7 = i6 - 1;
            if (i2 == ((Number) arrayList.get(i7)).intValue()) {
                return i7;
            }
        }
        return i6;
    }

    public int h(int i2) {
        if (i2 == 0) {
            return 0;
        }
        return ((Number) ((ArrayList) this.f5278b).get(i2 - 1)).intValue();
    }

    public int i(int i2, int i3) {
        while (i2 > i3) {
            char charAt = ((Layout) this.f5277a).getText().charAt(i2 - 1);
            if (charAt != ' ' && charAt != '\n' && charAt != 5760 && ((z2.h.g(charAt, 8192) < 0 || z2.h.g(charAt, 8202) > 0 || charAt == 8199) && charAt != 8287 && charAt != 12288)) {
                break;
            }
            i2--;
        }
        return i2;
    }

    public e(C0024g c0024g, K k3, List list, O0.b bVar, H0.d dVar) {
        t tVar;
        String str;
        ArrayList arrayList;
        int i2;
        int i3;
        ArrayList arrayList2;
        String str2;
        int i4;
        int i5;
        C0024g c0024g2 = c0024g;
        this.f5277a = c0024g2;
        this.f5278b = list;
        EnumC0863e enumC0863e = EnumC0863e.f8644i;
        this.f5279c = B2.a.x(enumC0863e, new C0.p(this, 1));
        this.f5280d = B2.a.x(enumC0863e, new C0.p(this, 0));
        C0024g c0024g3 = AbstractC0025h.f504a;
        int length = c0024g2.f500a.length();
        List list2 = c0024g2.f502c;
        list2 = list2 == null ? C0970v.f9165h : list2;
        ArrayList arrayList3 = new ArrayList();
        int size = list2.size();
        int i6 = 0;
        int i7 = 0;
        while (true) {
            tVar = k3.f476b;
            if (i6 >= size) {
                break;
            }
            C0022e c0022e = (C0022e) list2.get(i6);
            t tVar2 = (t) c0022e.f496a;
            int i8 = c0022e.f497b;
            if (i8 != i7) {
                arrayList3.add(new C0022e(i7, i8, tVar));
            }
            t a3 = tVar.a(tVar2);
            int i9 = c0022e.f498c;
            arrayList3.add(new C0022e(i8, i9, a3));
            i6++;
            i7 = i9;
        }
        if (i7 != length) {
            arrayList3.add(new C0022e(i7, length, tVar));
        }
        if (arrayList3.isEmpty()) {
            arrayList3.add(new C0022e(0, 0, tVar));
        }
        ArrayList arrayList4 = new ArrayList(arrayList3.size());
        int size2 = arrayList3.size();
        int i10 = 0;
        while (i10 < size2) {
            C0022e c0022e2 = (C0022e) arrayList3.get(i10);
            int i11 = c0022e2.f497b;
            int i12 = c0022e2.f498c;
            if (i11 != i12) {
                str = c0024g2.f500a.substring(i11, i12);
                z2.h.e(str, "this as java.lang.String…ing(startIndex, endIndex)");
            } else {
                str = "";
            }
            C0024g c0024g4 = new C0024g(str, AbstractC0025h.b(c0024g2, i11, i12), null, null);
            t tVar3 = (t) c0022e2.f496a;
            if (N0.k.a(tVar3.f544b, Integer.MIN_VALUE)) {
                arrayList = arrayList3;
                i2 = i10;
                i3 = size2;
                arrayList2 = arrayList4;
                str2 = str;
                tVar3 = new t(tVar3.f543a, tVar.f544b, tVar3.f545c, tVar3.f546d, tVar3.f547e, tVar3.f548f, tVar3.f549g, tVar3.f550h, tVar3.f551i);
            } else {
                arrayList2 = arrayList4;
                i3 = size2;
                arrayList = arrayList3;
                i2 = i10;
                str2 = str;
            }
            K k4 = new K(k3.f475a, tVar.a(tVar3));
            List a4 = c0024g4.a();
            List list3 = (List) this.f5278b;
            ArrayList arrayList5 = new ArrayList(list3.size());
            int size3 = list3.size();
            int i13 = 0;
            while (true) {
                i4 = c0022e2.f497b;
                if (i13 >= size3) {
                    break;
                }
                Object obj = list3.get(i13);
                C0022e c0022e3 = (C0022e) obj;
                if (AbstractC0025h.c(i4, i12, c0022e3.f497b, c0022e3.f498c)) {
                    arrayList5.add(obj);
                }
                i13++;
            }
            ArrayList arrayList6 = new ArrayList(arrayList5.size());
            int size4 = arrayList5.size();
            for (int i14 = 0; i14 < size4; i14++) {
                C0022e c0022e4 = (C0022e) arrayList5.get(i14);
                int i15 = c0022e4.f497b;
                if (i4 <= i15 && (i5 = c0022e4.f498c) <= i12) {
                    arrayList6.add(new C0022e(i15 - i4, i5 - i4, c0022e4.f496a));
                } else {
                    throw new IllegalArgumentException("placeholder can not overlap with paragraph.".toString());
                }
            }
            C0.r rVar = new C0.r(new K0.d(str2, k4, a4, arrayList6, dVar, bVar), i4, i12);
            arrayList4 = arrayList2;
            arrayList4.add(rVar);
            i10 = i2 + 1;
            arrayList3 = arrayList;
            size2 = i3;
            c0024g2 = c0024g;
        }
        this.f5281e = arrayList4;
    }

    public e(r1.r rVar) {
        this.f5277a = rVar;
        this.f5278b = new K1.b(rVar, 7);
        this.f5279c = new K1.p(rVar, 1);
        this.f5280d = new K1.p(rVar, 2);
        this.f5281e = new K1.h(rVar, 20);
    }
}
