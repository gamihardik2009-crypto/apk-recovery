package n0;

import android.view.MotionEvent;
import java.util.List;
import s.AbstractC1166e;

/* renamed from: n0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0930i {

    /* renamed from: a, reason: collision with root package name */
    public final List f8943a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8944b;

    /* renamed from: c, reason: collision with root package name */
    public int f8945c;

    public C0930i(List list, B.z zVar) {
        this.f8943a = list;
        MotionEvent motionEvent = zVar != null ? (MotionEvent) ((K1.c) zVar.f240d).f4533b : null;
        int i2 = 0;
        this.f8944b = motionEvent != null ? motionEvent.getButtonState() : 0;
        MotionEvent motionEvent2 = zVar != null ? (MotionEvent) ((K1.c) zVar.f240d).f4533b : null;
        if (motionEvent2 != null) {
            motionEvent2.getMetaState();
        }
        MotionEvent motionEvent3 = zVar != null ? (MotionEvent) ((K1.c) zVar.f240d).f4533b : null;
        int i3 = 1;
        if (motionEvent3 == null) {
            int size = list.size();
            while (true) {
                if (i2 >= size) {
                    i3 = 3;
                    break;
                }
                r rVar = (r) list.get(i2);
                if (AbstractC0937p.c(rVar)) {
                    i3 = 2;
                    break;
                } else if (AbstractC0937p.a(rVar)) {
                    break;
                } else {
                    i2++;
                }
            }
        } else {
            int actionMasked = motionEvent3.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        switch (actionMasked) {
                            case 8:
                                i2 = 6;
                                break;
                            case AbstractC1166e.f10135c /* 9 */:
                                i2 = 4;
                                break;
                            case AbstractC1166e.f10137e /* 10 */:
                                i2 = 5;
                                break;
                        }
                        i3 = i2;
                    }
                    i2 = 3;
                    i3 = i2;
                }
                i2 = 2;
                i3 = i2;
            }
            i2 = 1;
            i3 = i2;
        }
        this.f8945c = i3;
    }
}
