package J1;

import K0.j;
import K0.k;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f4339h = 0;

    /* renamed from: i, reason: collision with root package name */
    public final int f4340i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f4341j;

    public e(SystemForegroundService systemForegroundService, int i2) {
        this.f4341j = systemForegroundService;
        this.f4340i = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4339h) {
            case 0:
                ((SystemForegroundService) this.f4341j).f6963l.cancel(this.f4340i);
                break;
            default:
                ArrayList arrayList = (ArrayList) this.f4341j;
                int size = arrayList.size();
                int i2 = 0;
                if (this.f4340i == 1) {
                    while (i2 < size) {
                        K0.g gVar = (K0.g) arrayList.get(i2);
                        gVar.f4523a.setValue(Boolean.TRUE);
                        gVar.f4524b.f165i = new k(true);
                        i2++;
                    }
                    break;
                } else {
                    while (i2 < size) {
                        ((K0.g) arrayList.get(i2)).f4524b.f165i = j.f4527a;
                        i2++;
                    }
                    break;
                }
        }
    }

    public e(List list, int i2, Throwable th) {
        l0.c.r(list, "initCallbacks cannot be null");
        this.f4341j = new ArrayList(list);
        this.f4340i = i2;
    }
}
