package K0;

import B.F;
import C0.K;
import C0.s;
import D0.q;
import D0.r;
import J.W0;
import K1.m;
import android.text.Layout;
import android.text.TextPaint;
import g1.C0687i;
import java.text.BreakIterator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import m2.C0865g;

/* loaded from: classes.dex */
public final class d implements s {

    /* renamed from: a, reason: collision with root package name */
    public final String f4502a;

    /* renamed from: b, reason: collision with root package name */
    public final K f4503b;

    /* renamed from: c, reason: collision with root package name */
    public final List f4504c;

    /* renamed from: d, reason: collision with root package name */
    public final List f4505d;

    /* renamed from: e, reason: collision with root package name */
    public final H0.d f4506e;

    /* renamed from: f, reason: collision with root package name */
    public final O0.b f4507f;

    /* renamed from: g, reason: collision with root package name */
    public final e f4508g;

    /* renamed from: h, reason: collision with root package name */
    public final CharSequence f4509h;

    /* renamed from: i, reason: collision with root package name */
    public final q f4510i;

    /* renamed from: j, reason: collision with root package name */
    public m f4511j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f4512k;

    /* renamed from: l, reason: collision with root package name */
    public final int f4513l;

    /* JADX WARN: Code restructure failed: missing block: B:489:0x00b7, code lost:
    
        if (r10 == 1) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0522  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x05cd  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x05fb  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0609  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x064a  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x073c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0884  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x090b  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0680  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x05bb  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x04b6  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x04c4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:452:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:455:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:457:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:459:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:463:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:468:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0275 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00c7  */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v63, types: [Q1.r, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public d(java.lang.String r39, C0.K r40, java.util.List r41, java.util.List r42, H0.d r43, O0.b r44) {
        /*
            Method dump skipped, instructions count: 2392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: K0.d.<init>(java.lang.String, C0.K, java.util.List, java.util.List, H0.d, O0.b):void");
    }

    @Override // C0.s
    public final float a() {
        q qVar = this.f4510i;
        if (!Float.isNaN(qVar.f984e)) {
            return qVar.f984e;
        }
        TextPaint textPaint = qVar.f981b;
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        CharSequence charSequence = qVar.f980a;
        lineInstance.setText(new D0.m(charSequence, charSequence.length()));
        PriorityQueue priorityQueue = new PriorityQueue(10, new r(0));
        int i2 = 0;
        for (int next = lineInstance.next(); next != -1; next = lineInstance.next()) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new C0865g(Integer.valueOf(i2), Integer.valueOf(next)));
            } else {
                C0865g c0865g = (C0865g) priorityQueue.peek();
                if (c0865g != null && ((Number) c0865g.f8647i).intValue() - ((Number) c0865g.f8646h).intValue() < next - i2) {
                    priorityQueue.poll();
                    priorityQueue.add(new C0865g(Integer.valueOf(i2), Integer.valueOf(next)));
                }
            }
            i2 = next;
        }
        Iterator it = priorityQueue.iterator();
        float f3 = 0.0f;
        while (it.hasNext()) {
            C0865g c0865g2 = (C0865g) it.next();
            f3 = Math.max(f3, Layout.getDesiredWidth(charSequence, ((Number) c0865g2.f8646h).intValue(), ((Number) c0865g2.f8647i).intValue(), textPaint));
        }
        qVar.f984e = f3;
        return f3;
    }

    @Override // C0.s
    public final boolean b() {
        m mVar = this.f4511j;
        if (mVar == null || !mVar.l()) {
            if (!this.f4512k && j.a(this.f4503b)) {
                F f3 = i.f4526a;
                F f4 = i.f4526a;
                W0 w02 = (W0) f4.f165i;
                if (w02 == null) {
                    if (C0687i.c()) {
                        w02 = f4.v();
                        f4.f165i = w02;
                    } else {
                        w02 = j.f4527a;
                    }
                }
                if (((Boolean) w02.getValue()).booleanValue()) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // C0.s
    public final float c() {
        return this.f4510i.b();
    }
}
